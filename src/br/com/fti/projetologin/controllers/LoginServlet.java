package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fti.projetologin.dao.LoginDAO;

/**
 * Classe para a implementa��o do Servlet para a valida��o de logins.
 * 
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
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
    																   IOException, SQLException, ClassNotFoundException {
    	LoginDAO loginDao = new LoginDAO();
    	
    	String nomeUsuario = request.getParameter("textUsuario");
		String senhaUsuario = request.getParameter("textSenha");
			
		// primeiro if n�o � executado, pois os campos do formul�rio est�o como "required".
		if((nomeUsuario.equals("") || senhaUsuario.equals("")) || 
		  (!nomeUsuario.equals("") && senhaUsuario.equals("")) ||
		  (nomeUsuario.equals("") && !senhaUsuario.equals(""))) {
			RequestDispatcher rd = request.getRequestDispatcher("ErroCamposVaziosLogin.jsp");
			rd.forward(request, response);
		} else if(!loginDao.selecionar(nomeUsuario, senhaUsuario)) {
    		RequestDispatcher rd = request.getRequestDispatcher("ErroUsuarioOuSenha.jsp");
			rd.forward(request, response);
		} else if(loginDao.selecionar(nomeUsuario, senhaUsuario)) {
			RequestDispatcher rd = request.getRequestDispatcher("MenuInicial.jsp");
	    	rd.forward(request, response);
		}
	}
}