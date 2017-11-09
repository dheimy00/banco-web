<%@page import="br.com.banco.modelo.entidades.Banco"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
   	    <meta charset="utf-8">
   		<meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">

		<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js" ></script>

		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" ></script>

		<script src="${pageContext.request.contextPath}/paginas/banco/banco.js"  charset="UTF-8" ></script>
		<title>Projeto Banco</title>
</head>
<body>
	<form id="formCadastrarBanco" action="${pageContext.request.contextPath}/BancoServlet" method="post" >
	
	   <input id="acao" name="acao" type="hidden" >
	
		<%@ include file="../../menu.html" %>  
    
			<div class="panel panel-primary">
			 <div class="panel-heading">Cadastro de banco</div>
			  <div class="panel-body">
			  
			  	 <div id="mensagemObrigatorio" class="alert alert-danger" role="alert">
  				<span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
 				 <span class="sr-only">Error:</span>
 					Campos Obrigatórios não informados
				</div>
			  	
			  	<div class="row">
			  		<div class="col-md-6">
			  			<div class="form-group">
							<label>Número: <span class="obrigatorio">*</span></label>
							<input type="number" class="form-control" maxlength="6" name="txtNumero" id="txtNumero"  />			  				
			  			</div>
			  		</div>
			  		<div class="col-md-6">
			  			<div class="form-group">
							<label>Nome: <span class="obrigatorio">*</span></label>
							<input type="text"  class="form-control" name="txtNome"  maxlength="100" id="txtNome"  />			  				
			  			</div>
			  		</div>

		
			  	</div>
			  	
			  	<hr class="separator">
			  	
			  	<div class="row">
					<div class="col-md-6"></div>
				
					<div class="col-md-2 pull-right">
						<input type="button" id="btn_consultar"  value="Consultar" class="btn btn-primary form-control" >
					</div>
					
					<div class="col-md-2 pull-right">
						<input type="button" id="btn_salvar"  value="Salvar" class="btn btn-primary form-control" >
					</div>
				
					<div class="col-md-2 pull-right">
						<input type="reset" value="Limpar" id="btn_limpar" class="btn btn-primary form-control">
					</div>
				</div>

				<br/>

				<div class="row">
					<div class="col-md-12">
					<div class="table-responsive" id="tableBanco">
					<%List<Banco> bancosTable = (List<Banco>)request.getAttribute("bancos"); %>
					<% if(bancosTable != null){%>
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>Número</th>
									<th>Nome</th>
									<th>Ação</th>
								</tr>
							</thead>

							<tbody>
							<% for(Banco banco : bancosTable) {%>
								<tr>
							  	  <td><%=banco.getNumero() %></td>
							  	  <td><%=banco.getNome() %></td>
							  	  <td></td>
							  	</tr>
							<%}%>
							
							</tbody>
						</table>
							<%}%>
					</div>
					</div>
				</div>

			</div>
			</div>
	
	</form>
</body>
</html>