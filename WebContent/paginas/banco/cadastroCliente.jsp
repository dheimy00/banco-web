<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cadastro de Cliente</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">

<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>

<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

<script src="${pageContext.request.contextPath}/js/script.js"></script>

<script src="${pageContext.request.contextPath}/paginas/banco/banco.js"
	charset="UTF-8"></script>
</head>
<body>
	<form action="${pageContext.request.contextPath}/BancoServlet"
		method="post" id="BancoS">
		<%@ include file="../../menu.html"%>

		<div class="panel panel-primary ">
			<div class="panel-heading">Cadastro de Cliente</div>
			<div class="panel-body">

				<div id="mensagemObrigatorio" class="alert alert-danger"
					role="alert">
					<span class="glyphicon glyphicon-exclamation-sign"
						aria-hidden="true"></span> <span class="sr-only">Error:</span>
					Campos Obrigatórios não informados
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label>Nome : <span class="obrigatorio">*</span></label> <input
								type="text" name="txtNome" class="form-control"
								placeholder="Nome:">
						</div>
					</div>

					<div class="col-md-4">
						<div class="form-group">
							<label>CPF : <span class="obrigatorio">*</span></label> <input
								type="text" name="txtCPF" class="form-control" maxlength="14"
								placeholder="CPF:">
						</div>
					</div>


					<div class="col-md-4">
						<div class="form-group">
							<label>RG : <span class="obrigatorio">*</span></label> <input
								type="text" name="txtRG" class="form-control" maxlength="8"
								placeholder="RG:">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<div class="form-group">
							<label>Endereço :</label> <input type="text" name="txEndereco"
								class="form-control" placeholder="Endereço:">
						</div>
					</div>

					<div class="col-md-4">
						<div class="form-group">
							<label>Telefone :</label> <input type="text" name="txtelefone"
								class="form-control" placeholder="Telefone:">
						</div>
					</div>
					<div class="col-md-4">
						<div class="form-group">
							<label>Celular :</label> <input type="text" name="txCelular"
								class="form-control" placeholder="Celular:">
						</div>
					</div>
				</div>
				<hr class="separator">

				<div class="row">
					<div class="col-md-6"></div>

					<div class="col-md-2 pull-right">
						<input type="button" id="btn_consultar" value="Consultar"
							class="btn btn-primary form-control">
					</div>

					<div class="col-md-2 pull-right">
						<input type="button" id="btn_salvar" value="Salvar"
							class="btn btn-primary form-control">
					</div>

					<div class="col-md-2 pull-right">
						<input type="reset" value="Limpar" id="btn_limpar"
							class="btn btn-primary form-control">
					</div>
				</div>

			</div>
		</div>
	</form>





</body>
</html>