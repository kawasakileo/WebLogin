package br.com.fti.projetologin.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Classe que define os parâmetros do banco da dodos.
 */
public class CriarConexao {
	
	public static Connection getConexao() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		try {	
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProjetoLogin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
			System.out.println("CONECTADO...");
		} catch (SQLException e) {
			throw new SQLException(e);
		} 
		return conn;
	}
}