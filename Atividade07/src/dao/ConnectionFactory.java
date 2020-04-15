package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			System.out.println("Procurando o driver...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver encontrado com sucesso!");
		} catch (ClassNotFoundException ex) {
			System.err.println("O driver não foi encontrado.");
		}
	}
	
	public static Connection conectar() {
		try {
			return DriverManager
					.getConnection("jdbc:mysql://localhost/web_professores?useTimezone=true&serverTimezone=UTC&useSSL=false", 
							"root", "1065845");
		} catch (SQLException ex) {
			System.err.println("Não foi possível conectar!");
			ex.printStackTrace();
			return null;
		}
	}
	
}
