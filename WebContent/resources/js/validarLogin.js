/**
 * Método para a validação dos campos de login.
 * 
 */
function validarLogin() {
	if ((document.formLogin.textUsuario.value == "")
			&& (document.formLogin.textSenha.value == "")) {
		alert("Digite o usuário e a senha");
		return false;
	} else if (document.formLogin.textUsuario.value == "") {
		alert("Digite o usuário");
		return false;
	} else if (document.formLogin.textSenha.value == "") {
		alert("Digite a senha");
		return false;
	};
	document.formLogin.submit();
}