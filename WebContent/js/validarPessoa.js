function validarPessoa() {
	if (document.formPessoa.textNome.value == "") {
		alert("Digite o nome.");
		return false;
	} else if (document.formPessoa.textSobrenome.value == "") {
		alert("Digite o sobrenome.");
		return false;
	} else if (document.formPessoa.textCPF.value == "") {
		alert("Digite o CPF.");
		return false;
	} else if (document.formPessoa.textDataDeNascimento.value == "") {
		alert("Digite a data de nascimento.");
		return false;
	}
	document.formPessoa.submit();
}