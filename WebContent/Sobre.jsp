<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- link com o CSS -->
<link rel="stylesheet" href="./css/estilos.css">
<style>
#corpo {
	margin-left: auto;
	margin-right: auto;
	text-align: justify;
	width: 45%;
}
</style>
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
			<button class="dropbtn">Cadastros<i class="fa fa-caret-down"></i></button>
			<div class="dropdown-content">
				<a href="CadastroPessoa.jsp">Cadastrar</a> 
				<a href="VisualizarCadastros.jsp">Visualizar</a> 
			</div>
		</div> 
		<a href="Sobre.jsp">Sobre</a>
		<a href="Contato.jsp">Contato</a>
	</div>
	<div id="corpo" align="center">
		<h1 align="center">WebLogin</h1>
			<p>Projeto de um sistema web de cadastro e validações de login e cadastro de pessoas.</p>
		<h2 align="center">Tecnologias Utilizadas</h2>
			<p>Para a construção deste sistema foram utilizadas as tecnologias como JavaEE, JSP, 
			JavaScript, CSS, MySql e o Apache Tomcat. Também foram utilizados o MySql Workbench a versão EE do 
			Eclipse IDE.</p>
		<h2 align="center">Utilização</h2> 
			<p>É necessário possuir uma versão Java JDK 1.8 ou superior. Ao utilizar este código fonte 
			também é recomendado importá-lo para um projeto EE do Eclipse.</p>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>