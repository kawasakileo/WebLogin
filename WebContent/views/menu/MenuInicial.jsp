<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- link com o CSS -->
<link rel="stylesheet" type="text/css" href="../../resources/css/estilos.css">
<title>Menu Inicial</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="../../resources/images/fti.png" width="150" height="90">
		<hr>
	</div>
	<form action="VisualizaPessoas" method="post">
		<div class="navbar">
			<a href="../menu/MenuInicial.jsp">Home</a>
			<div class="dropdown">
				<button style="cursor: pointer" class="dropbtn">Cadastros<i class="fa fa-caret-down"></i></button>
				<div class="dropdown-content">
					<a href="../cadastros/CadastroPessoa.jsp">Cadastrar</a> 
				</div>
			</div>
			<a href="../menu/Sobre.jsp">Sobre</a> 
			<a href="../menu/Contato.jsp">Contato</a>
		</div>
	</form>
	<div id="corpo" align="center">
		<h1>Bem vindo!</h1>
		<br>
		<a href="Login.jsp" title=Sair>
			<img border="0" alt="Sair" src="../../resources/images/logout.png" width="30" height="30">
		</a>	
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>