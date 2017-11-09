/*$(document).ready(function(){
	$('#btn_salvar').click(function() {enviarDados()});
	$('#txCPF').focus(function() {
		$('#txCPF').css({"border-color":""});
	})
	$('#txNome').focus(function() {
		$('#txNome').css({"border-color":""});
	});
	$('#data').focus(function() {
		$('#data').css({"border-color" : ""});
	});
	$('#txSexo').focus(function() {
		$('#txSexo').css({"border-color" : ""});
	});	
	$('#cmbEstado').focus(function() {
		$('#cmbEstado').css({"border-color" : ""});
	});
	$('#cmbCidade').focus(function() {
		$('#cmbCidade').css({"border-color" : ""});
	});	


});
*/


$(document).ready(function(){
	$('#btnSalvar').click(function() {enviarDados()});
	$('#txtCPF').focus(function() {
		$('#txtCPF').css({"border-color":""});
	})
	$('#txNome').focus(function() {
		$('#txtNome').css({"border-color":""});
	});
	$('#data').focus(function() {
		$('#data').css({"border-color" : ""});
	});
	$('#txtEndereco').focus(function() {
		$('#txtEndereco').css({"border-color" : ""});
	});	
	$('#txtRG').focus(function() {
		$('#txtRG').css({"border-color" : ""});
	});
	$('#cmdPais').focus(function() {
		$('#cmdPais').css({"border-color" : ""});
	});	


});

function enviarDados(){

	var nome = $('#txtNome').val();   
	var cpf=$('#txtCPF').val();
	var rg = $('#txtRG').val();
	var endereco = $('#txtEndereco').val();
	var pais =$('#cmbPais').val();
	var data =$('#data').val();

	if(cpf ==='' || cpf === undefined){   
		$('#txtCPF').css({"border-color":"red"});
		alert('Preecnha campo CPF');
	}	
	else if(nome ==='' || nome === undefined){   
		$('#txtNome').css({"border-color":"red"});
		alert('Preecnha campo nome correto!');
	}
	else if(data === '' || data === undefined){   
		$('#data').css({"border-color":"red"});
		alert('Preecnha campo data');
	}
	else if(rg === '' || rg === undefined){   
		$('#txtRG').css({"border-color":"red"});
		alert('Preecnha campo rg');
	}
	else if(endereco === '' || endereco === undefined){   
		$('#txtEndereco').css({"border-color":"red"});
		alert('Preecnha campo endereco');
	}
	else if( pais === 'Selecione' || pais === undefined){   
		$('#cmbPais').css({"border-color":"red"});
		alert('Preecnha campo pais ');
	}
}
/*function msg(){
	var nome = $('#txNome').val();    
	var cpf = $('#txCPF').val();
	var estado = $('#cmbEstado').val();
	var cidade = $('#cmbCidade').val();
	var data =$('#data').val();
	var sexo =$('#sexo').val();
	var email =$('#txEmail').val();

	alert('Operação realizada com sucesso\n\nCPF : '+cpf+'\nNome : '+nome+'\nData Nascimento : '+data+'\nSexo : '+sexo+'\nEstado : '+estado+'\nCidade : '+cidade);



}
*/

