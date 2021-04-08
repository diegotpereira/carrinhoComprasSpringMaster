<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
  <div class="container">
	    <div class="page-header">
		    <h1>Cadastrar Cliente</h1>
		    <p class="lead">Por favor, preencha suas informações abaixo: </p>
	    </div>
  
		<form:form action="${pageContext.request.contextPath}/registro" method="post" commandName="cliente">
		<h3>Informações Básicas: </h3>
		
		<div class="form-group">
		  <label for="nome">Nome</label>
		  <form:errors path="clienteNome" cssStyle="color: #ff0000" />
		  <form:input path="clienteNome" id="nome" class="form-control" />
		</div>
		
		<div class="form-group">
		  <label for="email">E-mail</label>
		  <span style="color: #ff0000">${ emailMsg }</span>
		  <form:errors path="clienteEmail" cssStyle="color: #ff0000" />
		  <form:input path="clienteEmail" id="email" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="telefone">Telefone</label>
		   <form:input path="clienteTelefone" id="telefone" class="form-control"/>
		</div>
		
		<div class="form-group">
		   <label for="usuarionome">Nome de Usuário</label>
		   <span style="color: #ff0000">${ usuarionomeMsg }</span>
		   <form:errors path="usuarionome" cssStyle="color: #ff0000"/>
		   <form:input path="usuarionome" id="usuarionome" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="senha">Senha</label>
		   <form:errors path="senha" cssStyle="color: #ff0000" />
		   <form:password path="senha" id="senha" class="form-control" />
		</div>
		
		<br/>
		
		<h3>Endereço de Cobrança:</h3>
		
		<div class="form-group">
		  <label for="ruaNome">Nome da Rua</label>
		  <form:input path="enderecoCobranca.ruaNome" id="ruaNome" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="casaNumero">Casa N°</label>
		   <form:input path="enderecoCobranca.casaNumero" id="cobrancacasaNumero" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="cidade">Cidade</label>
		   <form:input path="enderecoEntrega.cidade" id="cidade" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="estado">Estado</label>
		   <form:input path="enderecoEntrega.estado" id="estado" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="pais">País</label>
		   <form:input path="enderecoEntrega.pais" id="pais" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="cep">CEP</label>
		   <form:input path="enderecoEntrega.cep" id="cep" class="form-control" />
		</div>
		
		<br/>
		
		<h3>Endereço de Entrega</h3>
		
		<div class="form-group">
		   <label for="ruaNome">Nome da Rua</label>
		   <form:input path="enderecoEntrega.ruaNome" id="ruaNome" class="form-control" />
		</div>
		
		<div class="form-group">
		   <label for="casaNumero">Número da Rua</label>
		   <form:input path="enderecoEntrega.casaNumero" id="casaNumero" class="form-control" />
		</div>

        <div class="form-group">
		   <label for="cidade">Cidade</label>
		   <form:input path="enderecoEntrega.cidade" id="cidade" class="form-control" />
		</div>
		
		
        <div class="form-group">
		   <label for="estado">Estado</label>
		   <form:input path="enderecoEntrega.estado" id="estado" class="form-control" />
		</div>
		
		 <div class="form-group">
		   <label for="pais">País</label>
		   <form:input path="enderecoEntrega.pais" id="pais" class="form-control" />
		</div>
		
		 <div class="form-group">
		   <label for="cep">CEP</label>
		   <form:input path="enderecoEntrega.cep" id="cep" class="form-control" />
		</div>
		
		<br/><br/>
		
		<input type="submit" value="submit" class="bt btn-default">
		<a href="<c:url value="/" />" class="btn btn-default">Cancelar</a>
		</form:form>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>