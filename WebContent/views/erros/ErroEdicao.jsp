<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Inválido</title>
<!-- link com o CSS -->
<link rel="stylesheet" type="text/css" href="../../resources/css/estilos.css">
<style>
#button {
	font-family: sans-serif;
	font-size: 15px;
  	background: none!important;
  	border: none;
  	padding: 0!important;
  	color: #0000EE;
	text-decoration: underline;
  	cursor: pointer;
}
</style>
</head>
<body>
	<div id="cabecalho" align="center">
		<p>Erro: Novos dados são inválidos.</p>
	</div>
	<div id="corpo" align="center">
		<hr>
		<img alt="erro" src="../../resources/images/erro1.png" width="150" height="155">
		<br></br>
		<form action="VisualizaPessoas" method="post">	
			<button id="button">Tentar novamente</button>
		</form>
	</div>
</body>
<footer>
	<div class= "footer" align="center">
		<p>Autor: Leonardo Kawasaki</p>
	</div>
</footer>
</html>