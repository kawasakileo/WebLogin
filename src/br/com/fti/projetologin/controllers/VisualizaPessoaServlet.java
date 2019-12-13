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
 * Servlet implementation class VisualizaPessoaServlet
 */
@WebServlet("/VisualizaPessoa")
public class VisualizaPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VisualizaPessoaServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PessoaDAO pessoaDao = new PessoaDAO();
	    ArrayList<Pessoa> pessoas = pessoaDao.selecionaPessoas();

	    request.setAttribute("pessoas", pessoas);

	    request.getRequestDispatcher("/PessoasCadastradas.jsp").forward(request, response);
	}
}