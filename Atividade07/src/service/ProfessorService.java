package service;

import java.util.List;

import dao.ProfessorDAO;
import model.Professor;

public class ProfessorService {

	private ProfessorDAO professorDao = new ProfessorDAO();
	
	
	public void cadastraProfessor(Professor professor) {
		professorDao.cadastrar(professor);
	}

	
	public Professor consultarProfessor(int matricula) {
		
		return professorDao.consultar(matricula);	
	}

	
	public void atualizarProfessor(Professor professor) {
		professorDao.alterar(professor);
	}

	
	public void deletarProfessor(Professor professor) {
		professorDao.excluir(professor);
	}
	
	
	public List<Professor> listaProfessores() {
		
		return professorDao.listarProfessores();	
	}
}
