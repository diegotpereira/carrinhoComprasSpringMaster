<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Página do Administrador</h1>
            <p class="lead">Essa é a página do administrador!.</p>
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
        
        <p>Aqui você pode ver, verificar e modificar o estoque de produtos</p>
        
        <br/><br/>
        
        <h3>
           <a href="<c:url value="/admin/cliente" /> ">Gestão de Clientes</a>
        </h3>
        
        <p>Aqui você pode ver as informações do cliente!</p>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>        