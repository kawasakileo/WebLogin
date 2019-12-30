/**
 * Método para a validação da exclusão do cadastro de pessoa.
 * 
 */
document.formVisualizaPessoa.getElementById("excluir").onclick = deletarCadastro();

function deletarCadastro() {
	if(confirm("Você irá excluir esse cadastro.")) {
		
	} else {
		
	}
	return false;	
}