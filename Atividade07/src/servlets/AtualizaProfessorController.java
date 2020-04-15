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
	 */
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
		
		response.getWriter().println(
				"<table border='1px'width='100%'>"
						+"<tr>"
							+"<th>Matricula</th>"
							+"<th>Nome</th>"
							+"<th>CPF</th>"
							+"<th>Endereço</th>"
							+"<th>Alterar</th>"
							+"<th>Deletar</th>"
						+"</tr>"
						+"<tr>"
							+"<td>"+professor.getMatricula()+"</td>"
							+"<td>"+professor.getNome()+"</td>"
							+"<td>"+professor.getCpf()+"</td>"
							+"<td>"+professor.getEndereco()+"</td>"
							+"<td><a href=editar.html?matricula="+professor.getMatricula()+">Atualizar</a></td>"
							+"<td><a href=excluirProfessor.do?matricula="+professor.getMatricula()+">excluir</a></td>"
						+"</tr>"
				+"</table>");
		

		 if(professor != null){  
	            
			 response.sendRedirect("listaProfessores.do");
	            
	        }else{  
	            out.println("Desculpe não foi possivel atualziar");  
	        }  
		
		 out.close();  
		
	}
	

}
