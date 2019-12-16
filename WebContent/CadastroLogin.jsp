<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- script JS -->
<script type="text/javascript" src="js/validarCadastro.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="css/style.css"> 
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
					<td><input type="text" name="textUsuarioCadastro" required></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><input type="password" name="textSenhaCadastro" required></td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<button id="cadastrarLogin" class="button" type="submit">Cadastrar</button>
						<!-- <button id="cadastrarLogin" class="button" type="submit" onclick="validarCadastro()">Cadastrar</button> -->
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
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>