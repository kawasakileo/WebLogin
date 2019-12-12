package br.com.fti.projetologin.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;

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
		boolean aux = false;
		try {
			validaDadosRecebidos(request, response);
			aux = true;
		} catch (Exception e) {
			e.printStackTrace();
			aux = false;
		} finally {
			if(aux) {
				RequestDispatcher rd = request.getRequestDispatcher("PessoaCadastrada.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("ErroCpfJaCadastrado.jsp");
				rd.forward(request, response);
			}
		}
	}
	
	private void validaDadosRecebidos(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
																	   IOException, ClassNotFoundException, SQLException {
		String nome = request.getParameter("textNome");
		String sobrenome = request.getParameter("textSobrenome");
		String cpf = request.getParameter("textCpf");
		String cep = request.getParameter("textCep");
		
		if(isCPF(cpf)) {
			Connection conn = CriarConexao.getConexao();
			
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nome);
			pessoa.setSobrenome(sobrenome);
			pessoa.setCpf(cpf);
			pessoa.setCep(cep);
			
			PessoaDAO pessoaDao = new PessoaDAO(conn);
			pessoaDao.adicionar(pessoa);
			
			conn.close(); 
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("ErroCpfInvalido.jsp");
			rd.forward(request, response);
		}
	}
	
	public boolean isCPF(String CPF) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (CPF.equals("00000000000") ||
            CPF.equals("11111111111") ||
            CPF.equals("22222222222") || CPF.equals("33333333333") ||
            CPF.equals("44444444444") || CPF.equals("55555555555") ||
            CPF.equals("66666666666") || CPF.equals("77777777777") ||
            CPF.equals("88888888888") || CPF.equals("99999999999") ||
            (CPF.length() != 11))
            return(false);
          
        char dig10, dig11;
        int sm, i, r, num, peso;
          
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
        	// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {              
            // converte o i-esimo caractere do CPF em um numero:
            // por exemplo, transforma o caractere '0' no inteiro 0         
            // (48 eh a posicao de '0' na tabela ASCII)         
            num = (int)(CPF.charAt(i) - 48); 
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
          
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
            num = (int)(CPF.charAt(i) - 48);
            sm = sm + (num * peso);
            peso = peso - 1;
            }
          
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                 dig11 = '0';
            else dig11 = (char)(r + 48);
          
            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
                 return(true);
            else return(false);
            } catch (InputMismatchException erro) {
                return(false);
        }
    }
}