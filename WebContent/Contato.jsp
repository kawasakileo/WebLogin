<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- link com o CSS -->
<link rel="stylesheet" href="css/estilos.css"> 
<title>Sobre</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="./images/fti.png" width="150" height="90">
		<hr>
	</div>
	<div class="navbar">
		<a href="MenuInicial.jsp">Home</a>
		<div class="dropdown">
			<button class="dropbtn">Realizar Cadastros <i class="fa fa-caret-down"></i></button>
			<div class="dropdown-content">
				<a href="CadastroPessoa.jsp">Cadastrar Pessoa</a> 
				<a href="PessoasCadastradas.jsp">Pessoas Cadastradas</a> 
			</div>
		</div> 
		<a href="Sobre.jsp">Sobre</a>
		<a href="Contato.jsp">Contato</a>
	</div>
	<div id="corpo" align="center">
		<h3>Informações para contato:</h3>
		<p>Email: leonardokws@gmail.com</p>
		<p>Telefone: (43)99957-1716</p>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>