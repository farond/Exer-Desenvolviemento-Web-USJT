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




@WebServlet("/atualizaProfessor.do")
public class AtualizaProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProfessorService professorService = new ProfessorService(); 
       
	/**
	 * Método responsável por atualizar um professor a partir de sua matricula
	 * 
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProfessorService professorService = new ProfessorService();
		int matricula = Integer.parseInt(request.getParameter("matricula"));
		Professor professor = professorService.consultarProfessor(matricula);
				
				// Saída:
				// Formulário para alterar os dados do professor:
				response.setContentType("text/html");
				
				// Criando um objeto para saída de caracteres:
				PrintWriter saida = response.getWriter();
				saida.println("<form action='atualizaProfessor.do' method='post'>");
				saida.println("Matrícula: " + professor.getMatricula());
				saida.println("<input type=\"hidden\" name='matricula' value='"
								+ professor.getMatricula() + "'> <br>");
				saida.println("Nome: ");
				saida.println("<input type='text' name='nome' value='" 
								+ professor.getNome() + "'> <br> ");
				saida.println("CPF: ");
				saida.println("<input type='text' name='cpf' value='"
								+ professor.getCpf() + "'> <br> ");
				saida.println("Endereço: ");
				saida.println("<input type='text' name='endereco' value='"
								+ professor.getEndereco() + "'> <br>");
				saida.println("<input type=\"submit\" value=\"Atualizar Professor\"/>");
				saida.println("</form>");
				
			
	}
	 
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
		PrintWriter out= response.getWriter();
		
		Professor professor = new Professor();
		professor.setCpf(request.getParameter("cpf"));
		professor.setEndereco(request.getParameter("endereco"));
		professor.setMatricula(Integer.parseInt(request.getParameter("matricula")));
		professor.setNome(request.getParameter("nome"));
		
		professorService.atualizarProfessor(professor);			
		

		 if(professor != null){  
	            
			 response.sendRedirect("listaProfessores.do");
	            
	        }else{  
	            out.println("Desculpe não foi possivel atualziar");  
	        }  
		
		 out.close();  
		
	}
	

}
