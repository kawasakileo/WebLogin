<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<!-- script JS -->
<script type="text/javascript" src="js/deletarCadastro.js"> </script>
<!-- link com o CSS -->
<link rel="stylesheet" href="./css/estilos.css">
<style>
a {
	font-family: sans-serif;
	font-size: 15px;
}

a:link {
	text-decoration: none;
}

a:visited {
	text-decoration: none;
}

a:hover {
	text-decoration: underline;
}

a:active {
	text-decoration: underline;
}
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
			<button class="dropbtn">Cadastros<i class="fa fa-caret-down"></i></button>
			<div class="dropdown-content">
				<a href="CadastroPessoa.jsp">Cadastrar</a> 
				<a href="VisualizarCadastros.jsp">Visualizar</a>
			</div>
		</div>
		<a href="Sobre.jsp">Sobre</a> <a href="Contato.jsp">Contato</a>
	</div>
	<div id="corpo" align="center" style="overflow: auto">
		<h3>Pessoas cadastradas:</h3>
		<form action="VisualizaPessoas" method="post"
			name="formVisualizaPessoa">
			<table id="table" class="table">
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Sobrenome</th>
					<th>CPF</th>
					<th>CEP</th>
					<th>Ações</th>
					<th></th>
				</tr>
				<c:forEach items="${pessoas}" var="pessoas">
					<tr>
						<td><c:out value="${pessoas.getId()}" /></td>
						<td><c:out value="${pessoas.getNome()}" /></td>
						<td><c:out value="${pessoas.getSobrenome()}" /></td>
						<td><c:out value="${pessoas.getCpf()}" /></td>
						<td><c:out value="${pessoas.getCep()}" /></td>
						<td><a href="EditarCadastro.jsp?id=${pessoas.getId()}">Editar</a></td>
						<td><a href="DeletarCadastro.jsp?id=${pessoas.getId()}">Excluir</a></td>
					</tr>
				</c:forEach>
			</table>
			<!-- <script>
				var index, table = document.getElementById('table');
				for (var i = 1; i < table.rows.length; i++) {
					table.rows[i].cells[6].onclick = function() {
						var c = confirm("Você irá excluir esse cadastro.");
						if (c === true) {
							index = this.parentElement.rowIndex;
							table.deleteRow(index);
							alert("Cadastro deletado com sucesso.");
						} else {
							alert("Operação cancelada.");
						}
					};
				}
			</script> -->
		</form>
	</div>
</body>
<footer>
	<div class="footer" align="center">
		<p> © Copyright <strong>Leonardo Kawasaki</strong>. Todos os direitos reservados.</p>
	</div>
</footer>
</html>