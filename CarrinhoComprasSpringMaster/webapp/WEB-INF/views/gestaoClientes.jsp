<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
   <div class="container">
       <div class="page-header">
           <h1>Página de Gerenciamento de Clientes</h1>
           <p class="lead">Esta é a página de gerenciamento de clientes</p>
       </div>
       
       <table class="table table-striped table-hover">
            <thead>
            <tr class="bg-success">
                <th>Nome</th>
                <th>E-mail</th>
                <th>Telefone</th>
                <th>Nome de Usuário</th>
                <th>Ativo</th>
            </tr>
            </thead>
            <c:forEach items="${ clienteLista }" var="cliente">
               <tr>
                  <td>${ cliente.clienteNome }</td>
                  <td>${ cliente.clienteEWmail }</td>
                  <td>${ cliente.clienteTelefone }</td>
                  <td>${ cliente.usuarionome }</td>
                  <td>${ cliente.ativado }</td>
              </tr>    
            </c:forEach>    
       </table>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>