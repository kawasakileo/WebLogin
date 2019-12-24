package br.com.fti.projetologin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.models.Login;

/**
 * Classe DAO (Data Access Object) para o objeto Login.
 * 
 * Dica: são nas classes DAO que são tratadas as queries SQL do banco de dados.
 */
public class LoginDAO {
	private Connection conn;
	
	public LoginDAO() {		
		
	}
	
	public LoginDAO(Connection conn) {
		this.conn = conn;
	}
		
	public void adicionar(Login login) throws SQLException {	
		String sql = "insert into login(usuario, senha) values (?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login.getUsuario());
		ps.setString(2, login.getSenha());
		ps.executeUpdate();
				
		ps.close();
		conn.close();
	}
	
	public void apagarTodos(Login login) throws SQLException {
		String sql = "delete from login where usuario is not null";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		
		ps.close();
		conn.close();
	}
				
	public boolean selecionar(Login login) throws SQLException, ClassNotFoundException {
		String sql = "select * from login where usuario like ? and senha like ?";
		boolean aux = false;

		conn = CriarConexao.getConexao();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, login.getUsuario());
		ps.setString(2, login.getSenha());
		ResultSet rs = ps.executeQuery();
			
		if (rs.next()) {
			aux = true;
		}
		ps.close();
		conn.close();
		
		return aux;
	}
}