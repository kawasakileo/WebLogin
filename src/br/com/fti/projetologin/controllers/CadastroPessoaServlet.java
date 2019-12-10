package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.dao.PessoaDAO;
import br.com.fti.projetologin.models.Pessoa;

/**
 * Classe para a implementação do Servlet para o cadastro de pessoas.
 * 
 */
@WebServlet("/CadastroPessoa")
public class CadastroPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastroPessoaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			validaDadosRecebidos(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void validaDadosRecebidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
																											IOException {
		String nome = request.getParameter("textNome");
		String sobrenome = request.getParameter("textSobrenome");
		String cpf = request.getParameter("textCpf");
		String cep = request.getParameter("textCep");
		
		try {
			Connection conn = CriarConexao.getConexao();
			
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setSobrenome(sobrenome);
			pessoa.setCpf(cpf);
			pessoa.setCep(cep);
			
			PessoaDAO pessoaDao = new PessoaDAO(conn);
			pessoaDao.adicionar(pessoa);
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		RequestDispatcher rd = request.getRequestDispatcher("PessoaCadastrada.jsp");
		rd.forward(request, response);
	}
}