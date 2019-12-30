<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- script JS -->
<script type="text/javascript" src="../../resources/js/validarPessoa.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" type="text/css" href="../../resources/css/estilos.css">
<title>Cadastrar</title>
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
		<h3>Cadastre uma pessoa:</h3>
		<form action="CadastroPessoa" method="post" name="formPessoa">
			<table>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="textNome" required></td>
				</tr>
				<tr>
					<td>Sobrenome:</td>
					<td><input type="text" name="textSobrenome" required></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><input type="text" name="textCpf" required></td>
				</tr>
				<tr>
					<td>CEP:</td>
					<td><input type="text" name="textCep" required></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button id="limparPessoa" class="button" type="reset">Limpar</button>
						<button id="cadastrarPessoa" class="button" type="submit">Cadastrar</button>
						<!-- <button id="cadastrarPessoa" class="button" type="submit" onclick="validaPessoa()">Cadastrar</button> -->
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