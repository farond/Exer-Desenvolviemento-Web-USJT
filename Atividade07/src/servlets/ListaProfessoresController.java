package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Professor;
import service.ProfessorService;




@WebServlet("/listaProfessores.do")
public class ListaProfessoresController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private final ProfessorService professorService = new ProfessorService(); 

	/**
	 * Método responsável por listar todos os professores
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
		response.getWriter().println("<a href='index.html'>Adicionar Novo Professor</a>");
		response.getWriter().println("<h1>Lista de Professores</h1>");
		response.getWriter().println("<title>Gerenciador de Professores</title>");
		
		List<Professor> listaProfessor = professorService.listaProfessores();
		
		
		for(Professor professor : listaProfessor) {
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
		}
	}
}
