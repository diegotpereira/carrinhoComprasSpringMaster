<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
   <div class="container">
       <section>
          <div class="jumbotron">
             <div class="container">
                <h1>Carrinho Inválido</h1>
             </div>
          </div>
       </section>
       
       <section class="container">
           <p><a href="<spring:url value="/produto/produtoLista" />" class="btn btn-default">Produtos</a></p>
       </section>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>