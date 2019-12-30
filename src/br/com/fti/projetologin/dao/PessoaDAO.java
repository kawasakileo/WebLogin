package br.com.fti.projetologin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.models.Pessoa;

/**
 * Classe DAO (Data Access Object) para o objeto Pessoa.
 * Dica: são nas classes DAO que são tratadas as queries SQL do banco de dados.
 * 
 */
public class PessoaDAO {
	private Connection conn;
	
	public PessoaDAO() {
		
	}

	public PessoaDAO(Connection conn) {
		this.conn = conn;
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
	
	public Pessoa selecionarPessoasPorId(int id) throws ClassNotFoundException, SQLException {
		String sql = "select * from pessoa where id like ?";
		Pessoa pessoa = null;

		conn = CriarConexao.getConexao();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "%" + id + "%");
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			String nome = rs.getString("nome");
			String sobrenome = rs.getString("sobrenome");
			String cpf = rs.getString("cpf");
			String cep = rs.getString("cep");
			
			pessoa = new Pessoa(id, nome, sobrenome, cpf, cep);
			// System.out.println(id);
			// System.out.println(nome);
			// System.out.println(sobrenome);
			// System.out.println(cpf);
			// System.out.println(cep);
		}
		rs.close();
		ps.close();

		return pessoa;
	}
	
	public ArrayList<Pessoa> selecionarPessoasList() throws ClassNotFoundException, SQLException {
		String sql = "select * from pessoa";
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		conn = CriarConexao.getConexao();
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			Pessoa pessoa = new Pessoa();
			pessoa.setId(rs.getInt("id"));
			pessoa.setNome(rs.getString("nome"));
			pessoa.setSobrenome(rs.getString("sobrenome"));
			pessoa.setCpf(rs.getString("cpf"));
			pessoa.setCep(rs.getString("cep"));
			pessoas.add(pessoa);
		}
		return pessoas;
	}
	
	public void editarPessoa(Pessoa pessoa) throws SQLException, ClassNotFoundException {
		String sql = "update pessoa set nome = ?, sobrenome = ?, cpf = ?, cep = ? where id = ?";
		
		conn = CriarConexao.getConexao();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, pessoa.getNome());
		ps.setString(2, pessoa.getSobrenome());
		ps.setString(3, pessoa.getCpf());
		ps.setString(4, pessoa.getCep());
		ps.setInt(5, pessoa.getId());
		
		// System.out.println(pessoa.getId());
		// System.out.println(pessoa.getNome());
		// System.out.println(pessoa.getSobrenome());
		// System.out.println(pessoa.getCpf());
		// System.out.println(pessoa.getCep());
		// System.out.println();
		
		ps.executeUpdate();
		ps.close();
		conn.close();
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
	
	public boolean existeId(int id) throws SQLException{
		String sql = "select id from pessoa where id like ?";
		boolean aux = false;
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			aux = true;
		}
		ps.close();
		conn.close();
		
		return aux;
	}
	
	public void apagarTodos() throws SQLException {
		String sql = "delete from pessoa where id is not null";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.execute();
		
		ps.close();
		conn.close();
	}
}