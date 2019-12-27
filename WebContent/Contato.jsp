<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- link com o CSS -->
<link rel="stylesheet" href="./css/estilos.css">
<title>Sobre</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="./images/fti.png" width="150" height="90">
		<hr>
	</div>
		<form action="VisualizaPessoas" method="post">
		<div class="navbar">
			<a href="MenuInicial.jsp">Home</a>
			<div class="dropdown">
				<button style="cursor: pointer" class="dropbtn">Cadastros<i class="fa fa-caret-down"></i></button>
				<div class="dropdown-content">
					<a href="CadastroPessoa.jsp">Cadastrar</a> 
				</div>
			</div>
			<a href="Sobre.jsp">Sobre</a> 
			<a href="Contato.jsp">Contato</a>
		</div>
	</form>
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