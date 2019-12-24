<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- script JS -->
<script type="text/javascript" src="js/validarPessoa.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="./css/estilos.css">
<title>Editar Cadastro</title>
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
		<h3>Editar cadastro:</h3>
		<form action="EditaPessoa" method="post" name="formEditaPessoa">
			<table>
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id" placeholder="Insira o ID v�lido" required/> </td>
				</tr>
				<tr>
					<td>Nome:</td>
					<td><input type="text" name="textNome" required /></td>
				</tr>
				<tr>
					<td>Sobrenome:</td>
					<td><input type="text" name="textSobrenome" required /></td>
				</tr>
				<tr>
					<td>CPF:</td>
					<td><input type="text" name="textCpf" required /></td>
				</tr>
				<tr>
					<td>CEP:</td>
					<td><input type="text" name="textCep" required /></td>
				</tr> 
				<tr>
					<td colspan="2" align="right">
						<button id="limparPessoa" class="button" type="reset">Limpar</button>
						<button id="cadastrarPessoa" class="button" type="submit">Atualizar</button>
						<!-- <button id="cadastrarPessoa" class="button" type="submit" onclick="validaPessoa()">Cadastrar</button> -->
					</td>
				</tr>
			</table>
		</form>
	</div>	
</body>
<footer>
	<div class="footer" align="center">
		<p> � Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>