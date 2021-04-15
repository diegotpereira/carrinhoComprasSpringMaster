<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
   <div class="container">
      <div class="page-header">
         <h1>Cliente</h1>
         
         <p class="lead">Cliente Detalhes: </p>
         
         <form:form commandName="pedido" class="form-horizontal">
         
         <h3>Endereço de Entrega</h3>
         
         <div class="form-group">
            <label for="enderecoEntrega">Nome da Rua</label>
            <form:input path="carrinho.cliente.enderecoEntrega.ruaNome" id="enderecoEntrega" class="form-Control"/>
         </div>
         
         <div class="form-group">
            <label for="casaNumero">Número</label>
            <form:input path="carrinho.cliente.enderecoEntrega.casaNumero" id="casaNumero" class="form-Control"/>
         </div>
         
         <div class="form-group">
            <label for="cidade">Cidade</label>
            <form:input path="carrinho.cliente.enderecoEntrega.cidade" id="cidade" class="form-Control"/>
         </div>
         
         <div class="form-group">
            <label for="estado">Estado</label>
            <form:input path="carrinho.cliente.enderecoEntrega.estado" id="estado" class="form-Control"/>
         </div>
         
         <div class="form-group">
            <label for="pais">País</label>
            <form:input path="carrinho.cliente.enderecoEntrega.pais" id="pais" class="form-Control"/>
         </div>
         
         <div class="form-group">
            <label for="cep">Cep</label>
            <form:input path="carrinho.cliente.enderecoEntrega.cep" id="cep" class="form-Control"/>
         </div>
         
         <button class="btn btn-default" name="_eventId_voltarParaCollectClienteInfo">Voltar</button>
         
         <input type="submit" value="Next" class="btn btn-default" name="_eventId_entregaDetalheColleted"/>
         
         <button class="btn btn-default" name="_eventId_cancel">Cancelar</button>
         </form:form>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>