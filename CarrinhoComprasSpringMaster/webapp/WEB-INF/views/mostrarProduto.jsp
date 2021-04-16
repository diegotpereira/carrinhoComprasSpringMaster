<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
   <div class="container">
      <div class="page-header">
          <h1>Produto Detalhe</h1>
          <p class="lead">Aqui estão as informações detalhadas do produto:</p>
      </div>
      
      <div class="container" ng-app ="carrinhoApp">
         <div class="row">
            <div class="col-md-5">
               <img src="<c:url value="/resources/imagens/${produto.produtoId}.png" />" alt="imagem" style="width:100%"/>
            </div>
            
            <div class="col-md-5">
               <h3>${produto.produtoNome}</h3>
               <p>${produto.produtoDescricao}</p>
               <p><strong>Fabricante</strong>: ${produto.produtoFabricante}</p>
               <p><strong>Categoria</strong>: ${produto.produtoCategoria}</p>
               <p><strong>Condição</strong>: ${produto.produtoCondicao}
               <p>${produto.produtoPreco } USD</p>
               
               <br/>
               
               <c:set var="role" scope="page" value="${param.role}" />
               <c:set var="url"  scope="page" value="/produto/produtoLista"/>
               
               <c:if test="${role = 'admin'}">
                  <c:set var="url" scope="page" value="/admin/produtoInventario" />
               </c:if>
               
               <p ng-controller="carrinhoCtrl">
                  <a href="<c:url value="${url}" />" class="btn btn-default">Voltar</a>
                  <a href="#" class="btn btn-warning btn-large" ng-click="adicionarNoCarrinho('${produto.produtoId}')"><span class="glyphicon glyphicon-shopping-cart"></span>Compre Agora</a>
                  <a href="<spring:url value="/cliente/carrinho"/>" class="btn btn-default"><span class="glyphicon glyphicon-hand-right"></span>Exibir Carrinho</a>
               </p>   
            </div>
         </div>
      </div>
<script src="<c:url value="/resources/js/controller.js?v3" /> "></script>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>