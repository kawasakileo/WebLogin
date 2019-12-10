package br.com.fti.projetologin.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fti.projetologin.conexao.CriarConexao;

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
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
		
	public boolean selecionar(String usuario, String senha) throws SQLException, ClassNotFoundException {
		String sql = "select * from login where usuario like ? and senha like ?";
		boolean aux = false;

		try {
			conn = CriarConexao.getConexao();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + usuario + "%");
			ps.setString(2, "%" + senha + "%");
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				aux = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		return aux;
	}
}