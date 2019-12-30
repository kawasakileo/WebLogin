/**
 * Método para a validação dos campos de cadastro de login.
 * 
 */
function validarCadastro() {
	if (document.formCadastro.textUsuarioCadastro.value == "" && 
			document.formCadastro.textSenhaCadastro.value == "") {
		alert("Digite o usuário e a senha");
		return false;
	} else if (document.formCadastro.textUsuarioCadastro.value == "") {
		alert("Digite o usuário");
		return false;
	} else if (document.formCadastro.textSenhaCadastro.value == "") {
		alert("Digite a senha");
		return false;
	};
	document.formCadastro.submit();
}