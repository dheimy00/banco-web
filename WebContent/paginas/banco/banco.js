$(document).ready(function() {
 
    $('#btn_salvar').click(function() {salvar()});
     
    $('#btn_consultar').click(function() {consultar()});
 
    $('#btn_limpar').click(function() {limpar()});
     
    limpar();
     
 
});
 
function consultar(){
    $('#tableBanco').show();
}
 
function salvar() {
 
    var nome = $('#txtNome').val();
     
    var numero = $('#txtNumero').val();
     
    var salvar = true;
     
 
    if (nome == '' || nome == undefined) {
         
        $('#txtNome').css({"border-color" : "red"});
         
         salvar = false;
    }
     
    if (numero == '' || numero == undefined) {
         
        $('#txtNumero').css({"border-color" : "red"});
         
        salvar = false;
         
    }
     
    if(salvar == true){
         
        $('#formCadastrarBanco').submit();
         
    }else{
         
        $('#mensagemObrigatorio').show();
    }
     
 
}
 
function limpar() {
     
    $('#mensagemObrigatorio').hide();
     
    $('#tableBanco').hide();
     
     $('#txtNome').css({"border-color" : ""});
      
     $('#txtNumero').css({"border-color" : ""});
     
    $('#txtNome').focus(function() {
          $('#txtNome').css({"border-color" : ""});
    });
         
        $('#txtNumero').focus(function() {
              $('#txtNumero').css({"border-color" : ""});
    });
}