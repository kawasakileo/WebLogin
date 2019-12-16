<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- script JS -->
<script type="text/javascript" src="js/esconderBotao.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="css/style.css"> 
<title>Cadastros</title>
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
				<a href="VisualizarCadastros.jsp">Pessoas Cadastradas</a> 
			</div>
		</div> 
		<a href="Sobre.jsp">Sobre</a>
		<a href="Contato.jsp">Contato</a>
	</div>
	<div id="corpo" align="center">
		<h3>Visualizar cadastros:</h3>
		<form action="VisualizaPessoas" method="post" name="formVisualizaPessoa">
			<table>
				<tr>
					<td colspan="2" align="right">
						<button id="visualizarCadastros" class="button" type="submit">Visualizar</button>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>