<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- script JS -->
<script type="text/javascript" src="js/validarLogin.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="css/style.css"> 
<title>Login</title>
</head>
<body>
	<div id="cabecalho" align="center">
		<img alt="fti" src="./images/fti.png" width="150" height="90">
		<hr>
		<h1>Login</h1>
	</div>
	<div id="corpo" align="center">
		<form action="Login" method="post" name="formLogin">
			<table>
				<tr>
					<td>Usuário:</td>
					<td><input type="text" name="textUsuario" required></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="textSenha" required></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button id="login" class="button" type="submit">Login</button>
						<!-- <button id="login" class="button" type="submit" onclick="validarLogin()">Login</button> -->
					</td>
				</tr>
			</table>
		</form>
		<form>
			<p>Deseja cadastrar um usuário?</p>
			<a href="CadastroLogin.jsp">Cadastrar usuário</a>
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>