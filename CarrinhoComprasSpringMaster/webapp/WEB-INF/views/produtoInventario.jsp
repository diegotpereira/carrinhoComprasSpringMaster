<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<script>
  $(document).ready(function(){
	  $('.table').DataTable({
		  "lengthMenu": [[1,2,3,5,10,-1], [1,2,3,5,10, "All"]]
	  });
  });
</script>

<div class="container-wrapper">
   <div class="container">
      <div class="page-header">
         <h1>Página de Inventário de Produtos</h1>
         
         <p class="lead">Essa é a página de inventário de produto</p>
         
      <table class="table table-stripped table-hover">
           <thead>
              <tr class="bg-success">
                  <th>Foto Tumb</th>
                  <th>Produto Nome</th>
                  <th>Categoria</th>
                  <th>Condição</th>
                  <th>Preço</th>
                  <th></th>
              </tr>
              </thead>
              <c:forEach items="${ produtos }" var="produto">
                 <tr>
                   <td><img src="<c:spring:url value="/produto/mostrarProduto/${ produto.produtoId }.png" />" alt="image" style="width:100%"/></td>
                   <td>${ produto.produtoNome }</td>
                   <td>${ produto.produtoCategoria }</td>
                   <td>${ produto.produtoCondicao }</td>
                   <td>${ produto.produtoPreco }</td>
                   <td>
                     <a href="<spring:url value="/produto/mostrarProduto/${ produto.produtoId }" />"><span class="glyphicon glyphicon-info-sign"></span></a>
                     <a href="<spring:url value="/admin/produto/deletarProduto/${ produto.produtoId}" />"><span class="glyphicon glyphicon-remove"></span></a>
                     <a href="<spring:url value="/admin/produto/editarProduto/${ produto.produtoId }" />"><span class="glyphicon glyphicon-pencil"></span></a>
                   </td>
                 </tr>    
              </c:forEach>    
      </table>
      <a href="<spring:url value="/admin/produto/adicionarProduto" />" class="btn btn-primary">Novo Produto</a>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>