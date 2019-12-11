<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- script JS -->
<script type="text/javascript" src="js/validarPessoa.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="css/estilos.css"> 
<title>Logado</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="./images/fti.png" width="150" height="90">
		<hr>
		<h1>Bem Vindo! Você está logado.</h1>
	</div>
	<div id="corpo" align="center">
		<h3>Cadastrar pessoa:</h3>
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
		<form>
			<br>
			<a href="Login.jsp">Sair</a>
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p>Autor: Leonardo Kawasaki</p>
	</div>
</footer>
</html>