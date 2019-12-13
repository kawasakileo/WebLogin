package br.com.fti.projetologin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.models.Pessoa;

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
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		
		ps.close();
		conn.close();
	}
	
	public boolean selecionar(Pessoa pessoa) throws SQLException, ClassNotFoundException {
		String sql = "select * from pessoa where nome like ? and sobrenome like ? and cpf like ? and cep like ?";
		boolean aux = false;

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
		ps.close();
		conn.close();
		
		return aux;
	}
	
	public ArrayList<Pessoa> selecionaPessoas() {
		String sql = "select * from pessoa";
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	    try {
	        conn = CriarConexao.getConexao();
	        PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
	        while(rs.next()){
	            Pessoa pessoa = new Pessoa();
	            pessoa.setId(rs.getInt("id"));
	            pessoa.setNome(rs.getString("nome"));
	            pessoa.setNome(rs.getString("sobrenome"));
	            pessoa.setNome(rs.getString("cep"));
	            pessoa.setNome(rs.getString("cpf"));
	            pessoas.add(pessoa);
	        }
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return pessoas;
	}
}