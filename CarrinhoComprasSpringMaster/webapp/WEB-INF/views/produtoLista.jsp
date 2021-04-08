<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<script>

    $(document).ready(function(){
        var buscarCondicao = '${buscarCondicao}';

        $('.table').DataTable({
            "lengthMenu": [[1,2,3,5,10, -1], [1,2,3,5,10, "All"]],
            "oSearch" : {"sSearch": buscarCondicao}
        });
    });
</script>

<div class="container-wrapper">
	  <div class="container"> 
	      <div class="page-header">
		     <h1>Lista de Produtos</h1>
		     
		     <p class="lead">Confira todos os produtos incríveis disponíveis agora</p>
	     </div>
		  
		  <table class="table table-striped table-hover">
		    <thead>
		      <tr class="bg-success">
		        <th>Foto Thumb</th>
		        <th>Nome Produto</th>
		        <th>Categoria</th>
		        <th>Condição</th>
		        <th>Preço</th>
		        <th></th>
		      </tr>
		    </thead>
		    
		    <c:forEach items="${produtos}" var="produto">
		       <tr>
		         <td><img src="<c:url value="/resources/imagens/${produto.produtoId}.png" />" alt="image" style="width:100%"/></td>
		         <td>${ produto.produtoNome }</td>
		         <td>${ produto.produtoCategoria }</td>
		         <td>${ produto.produtoCondicao }</td>
		         <td>${ produto.produtoPreco } USD</td>
		         <td><a href="<spring:url value="/produto/mostrarProduto/${produto.produtoId}" />"><span class="glyphicon glyphicon-info-sign"></span></a>
		       </tr>  
		    </c:forEach>
		  </table>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>