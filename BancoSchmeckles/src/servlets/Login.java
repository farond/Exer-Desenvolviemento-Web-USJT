package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet(
		name = "Login.do", 
		urlPatterns = { 
				"/Login.do"		
		})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	//response.setContentType("Autenticacao.html");
    	
    }
    

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");  
		PrintWriter out= response.getWriter();
	    request.getRequestDispatcher("Login.do");	
		
		String usuario = request.getParameter("conta");
		String senha = request.getParameter("senha");	
		
		HttpSession sessao = request.getSession();
			
		if(usuario.equals("654321") && senha.equals("123456")) {
			out.println("Bem Vindo, Conta: " + usuario);			
			sessao.setAttribute("usuario", usuario);
            response.sendRedirect("Home.do");
			}
		else if(usuario.equals("") || senha.equals("")){
			out.println("Preencha a caixa antes de seguir");
			request.getRequestDispatcher("login.html").include(request, response);
			}
		else {
			out.println("Dados incorretos faça login novamente");
			request.getRequestDispatcher("login.html").include(request, response);		
		}
		out.close();
	}	

}
