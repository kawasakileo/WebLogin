package br.com.fti.projetologin.pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.fti.projetologin.conexao.CriarConexao;

/**
 * Classe DAO (Data Access Object) para o objeto Pessoa.
 * 
 * Dica: são nas classes DAO que são tratadas as queries SQL do banco de dados.
 */
public class PessoaDAO {
	private Connection conn;
	
	public PessoaDAO() {
		
	}

	public PessoaDAO(Connection conn) {
		this.conn = conn;
	}

	public void adicionar(Pessoa pessoa) throws SQLException {	
		String sql = "insert into pessoa(nome, sobrenome, cpf, cep) values (?, ?, ?, ?)";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, pessoa.getNome());
		ps.setString(2, pessoa.getSobrenome());
		ps.setString(3, pessoa.getCpf());
		ps.setString(4, pessoa.getCep());
			
		ps.executeUpdate();		
		
		ps.close();
		conn.close();
	}
	
	public void apagarTodos(Pessoa pessoa) throws SQLException {
		String sql = "delete from pessoa where id is not null";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
	
	public boolean selecionar(Pessoa pessoa) throws SQLException, ClassNotFoundException {
		String sql = "select * from pessoa where nome like ? and sobrenome like ? and cpf like ? and cep like ?";
		boolean aux = false;

		try {
			conn = CriarConexao.getConexao();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + pessoa.getNome() + "%");
			ps.setString(2, "%" + pessoa.getSobrenome() + "%");
			ps.setString(3, "%" + pessoa.getCpf() + "%");
			ps.setString(4, "%" + pessoa.getCep() + "%");
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