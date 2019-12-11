package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.dao.LoginDAO;
import br.com.fti.projetologin.models.Login;

/**
 * Classe para a implementação do Servlet para o cadastro de logins.
 * 
 */
@WebServlet("/CadastroLogin")
public class CadastroLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CadastroLoginServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean aux = false;
		try {
			validaDadosRecebidos(request, response);
			aux = true;
		} catch (Exception e) {
			e.printStackTrace();
			aux = false;
		} finally {
			if(aux) {
				RequestDispatcher rd = request.getRequestDispatcher("UsuarioCadastrado.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("ErroUsuarioJaCadastrado.jsp");
				rd.forward(request, response);
			}
 		}
	}
	
	private void validaDadosRecebidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
																	  IOException, ClassNotFoundException, SQLException {
		String nomeUsuario = request.getParameter("textUsuarioCadastro");
		String senhaUsuario = request.getParameter("textSenhaCadastro");
		
		Connection conn = CriarConexao.getConexao();
		
		// else não é executado, pois os campos do form estão como "required".
		Login login = new Login();
		if(!nomeUsuario.equals("") && !senhaUsuario.equals("")) {
			login.setUsuario(nomeUsuario);
			login.setSenha(senhaUsuario);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("ErroCamposVaziosCadastroLogin.jsp");
			rd.forward(request, response);
		}
		LoginDAO dao = new LoginDAO(conn);
		dao.adicionar(login);
				
		conn.close(); 	
	}
}