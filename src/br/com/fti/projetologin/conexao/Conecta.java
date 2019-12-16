package br.com.fti.projetologin.conexao;

import java.sql.Connection;
import java.sql.SQLException;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.dao.LoginDAO;
import br.com.fti.projetologin.dao.PessoaDAO;
import br.com.fti.projetologin.models.Login;
import br.com.fti.projetologin.models.Pessoa;

/**
 * Classe para teste da conexão com o banco de dados. Ela poderá ser apagada depois.
 * 
 */
public class Conecta {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = CriarConexao.getConexao();
		
		PessoaDAO pessoaDao = new PessoaDAO(conn);
		pessoaDao.apagarTodos();		
		conn.close();
	} 
}