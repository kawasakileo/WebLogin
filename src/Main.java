import java.sql.Connection;
import java.sql.SQLException;
import br.com.fti.projetologin.conexao.CriarConexao;
import br.com.fti.projetologin.dao.LoginDAO;
import br.com.fti.projetologin.dao.PessoaDAO;
import br.com.fti.projetologin.models.Login;
import br.com.fti.projetologin.models.Pessoa;

/**
 * Classe Main apenas para teste da conexão com o banco de dados. Ela poderá ser apagada depois.
 * 
 */
public class Main {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = CriarConexao.getConexao();
		
		Login login = new Login();
		Pessoa pessoa = new Pessoa();
		// login.setUsuario("teste");
		// login.setSenha("123");
		
		LoginDAO loginDao = new LoginDAO(conn);
		// loginDao.apagarTodos(login); 
		
		PessoaDAO pessoaDao = new PessoaDAO(conn);
		pessoaDao.apagarTodos(pessoa);
		
		conn.close();
	} 
}