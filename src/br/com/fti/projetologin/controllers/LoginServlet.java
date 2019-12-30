package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fti.projetologin.dao.LoginDAO;
import br.com.fti.projetologin.models.Login;

/**
 * Classe para a implementação do Servlet para a validação de logins.
 * 
 */
@WebServlet("/views/login/Login")
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
		Login login = new Login();
			
		String nomeUsuario = request.getParameter("textUsuario");
		String senhaUsuario = request.getParameter("textSenha");

		login.setUsuario(nomeUsuario);
		login.setSenha(senhaUsuario);
		
		boolean queryDao = loginDao.selecionar(login);
		
		if (queryDao == false) {
			response.sendRedirect("../erros/ErroUsuarioOuSenha.jsp");
		} else {
			response.sendRedirect("../menu/MenuInicial.jsp");
		}
	}
}