<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Cliente</h1>
            
            <p class="lead">Cliente Detalhes: </p>
        </div>
        
        <form:form commandName="pedido" class="form-horizontal">
        
        <h3>Informações Básicas: </h3>
        
        <div class="form-group">
           <label for="nome">Nome</label>
           <form:input path="carrinho.cliente.clienteNome" id="nome" class="form-Control" />
        </div>
        
        <div class="form-group">
           <label for="email">E-mail</label>
           <form:input path="carrinho.cliente.clienteEmail" id="email" class="form-Control" />
        </div>
        
        <div class="form-group">
           <label for="telefone">Telefone</label>
           <form:input path="carrinho.cliente.clienteTelefone" id="telefone" class="form-Control"/>
        </div>
        
        <br />
        
        <h3>Endereço Para a Cobrança</h3>
        
        <div class="form-group">
           <label for="ruaNome">Nome da Rua</label>
           <form:input path="carrinho.cliente.enderecoCobranca.ruaNome" id="enderecoCobranca" class="from-Control" />
        </div>
        
        <div class="form-group">
           <label for="casaNumero">Casa Número</label>
           <form:input path="carrinho.cliente.enderecoCobranca.casaNumero" id="enderecoCobranca" class="form-Control" />
        </div> 
        
        <div class="form-group">
           <label for="cidade">Cidade</label>
           <form:input path="carrinho.cliente.enderecoCobranca.cidade" id="cidade" class="form-Control" />
        </div>
        
        <div class="form-group">
           <label for="estado">Estado</label>
           <form:input path="carrinho.cliente.enderecoCobranca.estado" id="estado" class="form-Control" />
        </div>
        
        <div class="form-group">
           <label for="pais">País</label>
           <form:input path="carrinho.cliente.enderecoCobranca.pais" id="pais" class="form-Control"/>
        </div>
        
        <div class="form-group"> 
           <label for="cep">Cep</label>
           <form:input path="carrinho.cliente.enderecoCobranca.cep" id="cep" class="form-Control" />
        </div>
        
        <input type="hidden" name="_flowExecutionKey" />
        
        <br/><br/>
        
        <input type="submit" value="Next" class="btn btn-default" name="_eventId_clienteInfoColleted" />
        
        <button class="btn btn-default" name="_eventId_cancel">Cencelar</button>
        </form:form>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>