package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Professor;
import service.ProfessorService;




@WebServlet("/listaProfessor.do")
public class ListaProfessorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProfessorService professorService = new ProfessorService(); 
       
	/**
	 * Método responsável por buscar um professor por sua matrícula
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int matricula = Integer.parseInt(request.getParameter("matricula"));
		Professor professor = professorService.consultarProfessor(matricula);
		
		response.getWriter().print(
				"<table>"
						+"<tr>"
							+"<td><th>Matricula</th></td>"
							+"<td><th>Nome</th></td>"
							+"<td><th>CPF</th></td>"
							+"<td><th>Endereço</th></td>"
						+"</tr>"
						+"<tr>"
							+"<td>"+professor.getMatricula()+"</td>"
							+"<td>"+professor.getNome()+"</td>"
							+"<td>"+professor.getCpf()+"</td>"
							+"<td>"+professor.getEndereco()+"</td>"
						+"</tr>"
				+"</table>");
	}


}
