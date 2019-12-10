package br.com.fti.projetologin.conexao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Classe que gera a conexão com o banco de dados.
 * 
 */
public class Conecta {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = CriarConexao.getConexao();
		conn.close();
	} 
}