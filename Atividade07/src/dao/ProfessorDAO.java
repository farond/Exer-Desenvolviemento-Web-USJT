package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Professor;

import java.sql.ResultSet;

public class ProfessorDAO {
	
	private Connection conexao;
	
	public ProfessorDAO() {
		this.conexao = ConnectionFactory.conectar();
	}

	public void cadastrar(Professor professor) {
			
		String inserir = "INSERT INTO professor "
				+ " (matricula, cpf, nome, endereco) "
				+ " VALUES (?, ?, ?, ?) ";
		
		try ( PreparedStatement pst = 
				conexao.prepareStatement(inserir) ) {
			
			pst.setInt(1, professor.getMatricula());
			pst.setString(2, professor.getCpf());
			pst.setString(3, professor.getNome());
			pst.setString(4, professor.getEndereco());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular "
					+ "a tabela Professor.");
			ex.printStackTrace();
			
		}
	}
	
	public void alterar(Professor professor) {
		
		String alterar = "UPDATE professor "
				+ "SET cpf = ?, nome = ?, endereco = ? "
				+ " WHERE matricula = ? ";
		
		try ( PreparedStatement pst = 
				conexao.prepareStatement(alterar) ) {
			
			pst.setString(1, professor.getCpf());
			pst.setString(2, professor.getNome());
			pst.setString(3, professor.getEndereco());
			pst.setInt(4, professor.getMatricula());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular "
					+ "a tabela Professor.");
			ex.printStackTrace();
			
		}
	}
	
	public void excluir(Professor professor) {
		
		String excluir = "DELETE FROM professor "
				+ " WHERE matricula = ? ";
		
		try ( PreparedStatement pst = 
				conexao.prepareStatement(excluir) ) {
			
			pst.setInt(1, professor.getMatricula());
			
			pst.execute();
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular "
					+ "a tabela Professor.");
			ex.printStackTrace();
		}
	}
	
	public Professor consultar(int matricula) {
		
		String consultar = "SELECT * FROM professor "
				+ " WHERE matricula = ? ";
		
		try ( PreparedStatement pst = 
				conexao.prepareStatement(consultar) ) {
			
			pst.setInt(1, matricula);
			ResultSet resultado = pst.executeQuery();
			
			Professor p = new Professor();
			if (resultado.next()) {
				p.setCpf(resultado.getString("cpf"));
				p.setEndereco(resultado.getString("endereco"));
				p.setMatricula(matricula);
				p.setNome(resultado.getString("nome"));
			}
			return p;
			
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular "
					+ "a tabela Professor.");
			ex.printStackTrace();
			
			return null;
		}
	}

	
	public ArrayList<Professor> listarProfessores() {
		
		String inserir = "SELECT * FROM professor";
		
		try ( PreparedStatement pst = 
				conexao.prepareStatement(inserir) ) {
			
			ResultSet resultado = pst.executeQuery();
			
			ArrayList<Professor> lista = new ArrayList<>();
			while (resultado.next()) {
				Professor p = new Professor();
				p.setCpf(resultado.getString("cpf"));
				p.setEndereco(resultado.getString("endereco"));
				p.setMatricula(resultado.getInt("matricula"));
				p.setNome(resultado.getString("nome"));
				lista.add(p);
			}
			return lista;
			
		} catch (SQLException ex) {
			
			System.err.println("Não foi possível manipular "
					+ "a tabela Professor.");
			ex.printStackTrace();
			
			return null;
		}
	}

}
