package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Professor;
import service.ProfessorService;




@WebServlet("/cadastraProfessor.do")
public class CadastraProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProfessorService professorService = new ProfessorService(); 
       
	/**
	 * Método responsável por cadastrar um professor 
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out= response.getWriter();
		
		Professor professor = new Professor();
		professor.setNome(request.getParameter("nome"));
		professor.setEndereco(request.getParameter("endereco"));
		professor.setCpf(request.getParameter("cpf"));		
		professor.setMatricula(Integer.parseInt(request.getParameter("matricula")));		
		
		professorService.cadastraProfessor(professor);
		
		
		 if(professor != null){  
	            out.print("<p>Professor Salvo com Sucesso!</p>");  
	            request.getRequestDispatcher("index.html").include(request, response); 
	            
	        }else{  
	            out.println("Desculpe não foi possivel Salvar");  
	        }  
		
		 out.close();  
		
	}

}
