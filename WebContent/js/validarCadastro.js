function validarCadastro() {
	if (document.formCadastro.textUsuarioCadastro.value == "" && 
			document.formCadastro.textSenhaCadastro.value == "") {
		alert("Digite o Usuário e a Senha");
		return false;
	} else if (document.formCadastro.textUsuarioCadastro.value == "") {
		alert("Digite o Usuário");
		return false;
	} else if (document.formCadastro.textSenhaCadastro.value == "") {
		alert("Digite a Senha");
		return false;
	};
	document.formCadastro.submit();
}