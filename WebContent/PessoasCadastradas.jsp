<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- link com o CSS -->
<link rel="stylesheet" href="css/style.css">
<style>
</style>
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
	<div id="corpo" align="center" style="overflow:auto">
		<h3>Visualizar cadastros:</h3>
		<form action="VisualizaPessoas" method="post" name="formVisualizaPessoa">
			<table>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Sobrenome</th>
					<th>CPF</th>
					<th>CEP</th>
				</tr>
				<c:forEach items="${pessoas}" var="pessoas">
					<tr>
						<td><c:out value="${pessoas.getId()}" /></td>
						<td><c:out value="${pessoas.getNome()}" /></td>
						<td><c:out value="${pessoas.getSobrenome()}" /></td>
						<td><c:out value="${pessoas.getCpf()}" /></td>
						<td><c:out value="${pessoas.getCep()}" /></td>
					</tr>
				</c:forEach>
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