<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
       <section>
           <div class="jumbotron">
               <div class="container">
                   <h1>Agrade�o pelos seus servi�os</h1>
                   
                   <p>Seu pedido ser� enviado em dois dias �teis</p>
               </div>
           </div>
       </section>
       
       <section class="container">
           <p><a href="<spring:url value="/" />" class="btn btn-default">Ok</a></p>
       </section>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>