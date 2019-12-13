<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- link com o CSS -->
<link rel="stylesheet" href="css/estilos.css"> 
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
				<a href="PessoasCadastradas.jsp">Pessoas Cadastradas</a> 
			</div>
		</div> 
		<a href="Sobre.jsp">Sobre</a>
		<a href="Contato.jsp">Contato</a>
	</div>
	<div id="corpo" align="center">
		<form action="VisualizaPessoa" method="post" name="visualizaPessoas">
			<table>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Sobrenome</th>
					<th>CEP</th>
					<th>CPF</th>
				</tr>
				<c:forEach var="pessoas" items="${pessoas}">
					<tr>
						<td>${pessoa.getId()}</td>
						<td>${pessoa.getNome()}</td>
						<td>${pessoa.getSobrenome()}</td>
						<td>${pessoa.getCpf()}</td>
						<td>${pessoa.getCep()}</td>
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