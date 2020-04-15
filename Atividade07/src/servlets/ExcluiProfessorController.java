package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Professor;
import service.ProfessorService;




@WebServlet("/excluirProfessor.do")
public class ExcluiProfessorController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	private final ProfessorService professorService = new ProfessorService(); 
	
	/**
	 * Método responsável por deletar um professor pela matricula
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Professor professor = new Professor();
		professor.setMatricula(Integer.parseInt(request.getParameter("matricula")));
		
		professorService.deletarProfessor(professor);
		
		response.sendRedirect("listaProfessores.do");
	}
}
