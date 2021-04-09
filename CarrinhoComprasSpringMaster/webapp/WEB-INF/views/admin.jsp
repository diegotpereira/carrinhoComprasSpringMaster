<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>P�gina do Administrador</h1>
            <p class="lead">Essa � a p�gina do administrador!.</p>
        </div>
        
        <c:if test="${ pageContext.request.userPrincipal.name != null }">
           <h2> 
              bem Vindo: ${ pageContext.request.userPrincipal.name } |
              <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
           </h2>
        </c:if>
        
        <h3>
           <a href="<c:url value="/admin/produtoInventario" /> ">Produto Inventario</a>
        </h3>
        
        <p>Aqui voc� pode ver, verificar e modificar o estoque de produtos</p>
        
        <br/><br/>
        
        <h3>
           <a href="<c:url value="/admin/cliente" /> ">Gest�o de Clientes</a>
        </h3>
        
        <p>Aqui voc� pode ver as informa��es do cliente!</p>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>        