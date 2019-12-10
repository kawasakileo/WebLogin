<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- script JS -->
<script type="text/javascript" src="js/validarCadastro.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="css/estilos.css"> 
<title>Cadastro de Usuário</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="./images/fti.png" width="150" height="90">
		<hr>
		<h1>Cadastro de Usuário:</h1>
	</div>
	<div id="corpo" align="center">
		<form action="CadastroLogin" method="post" name="formCadastro">
			<table>
				<tr>
					<td>Usuário:</td>
					<td><input type="text" name="textUsuarioCadastro"></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="textSenhaCadastro"></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button class="button" type="submit" onclick="validarCadastro()">Cadastrar</button>
					</td>
				</tr>
			</table>
		</form>
		<form>
			<p></p>
			<a href="Login.jsp">Voltar</a>
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p>Autor: Leonardo Kawasaki</p>
	</div>
</footer>
</html>