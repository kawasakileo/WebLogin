package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fti.projetologin.dao.PessoaDAO;
import br.com.fti.projetologin.models.Pessoa;

/**
 * Classe para a implementação do Servlet para a visualização das pessoas cadastradas.
 * 
 */
@WebServlet("/VisualizaPessoas")
public class VisualizaPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public VisualizaPessoaServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			ArrayList<Pessoa> pessoas = pessoaDAO.selecionarPessoasList();
			request.setAttribute("pessoas", pessoas);
			request.getRequestDispatcher("PessoasCadastradas.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}