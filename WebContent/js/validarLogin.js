function validarLogin() {
	if ((document.formLogin.textUsuario.value == "")
			&& (document.formLogin.textSenha.value == "")) {
		alert("Digite Usuário e Senha");
		return false;
	} else if (document.formLogin.textUsuario.value == "") {
		alert("Digite o Usuário");
		return false;
	} else if (document.formLogin.textSenha.value == "") {
		alert("Digite a Senha");
		return false;
	};
	document.formLogin.submit();
}