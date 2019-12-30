<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- link com o CSS -->
<link rel="stylesheet" type="text/css" href="../../resources/css/estilos.css">
<title>Pessoa Cadastrada</title>
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
		<form>
			<h1>Cadastrado atualizado com sucesso.</h1>
		</form>
		<form>
			<a href="../menu/MenuInicial.jsp">Voltar</a>
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>