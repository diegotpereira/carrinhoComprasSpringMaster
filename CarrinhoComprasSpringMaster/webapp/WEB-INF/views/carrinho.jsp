<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <section>
             <div class="jumbotron">
                 <div class="container">
                     <h1>Carrinho</h1>
                     <p>Todos os produtos selecionados em seu carrinho de compras</p>
                 </div>
             </div>
        </section>
        
        <section class="container" ng-app="carrinhoApp">
            <div ng-controller="carrinhoCtrl" ng-init="initCartId('${ carrinhoId }')">
                <div>
                    <a class="btn btn-danger pull-left" ng-click = "clearCarrinho()"><span class="ghyphicon ghyphicon-remove-sign"></span>Limpar Carrinho</a>
                    <a href="<spring:url value = "/pedido/${ carrinhoId }" />" class="btn btn-success pull-right"><span class="ghyphicon ghyphicon-shopping-cart"></span>Verificação de saída</a>
                </div>
                
                <br/><br/><br/>
                
                
                <table class="table table-hover">
                   <tr>
                      <th>Produto</th>
                      <th>Preço Unidade</th>
                      <th>Quantidade</th>
                      <th>Preço</th>
                      <th>Ação</th>
                   </tr>
                   
                   <tr ng-repeat = "item in carrino.cartItems">
                       <td>{{ item.produto.produtoNome }} </td>
                       <td>{{ item.produto.produtoPreco }} </td>
                       <td>{{ item.quantidade }}</td>
                       <td>{{ item.totalPreco }}</td>
                       <td><a href="#" class="label label-danger" ng-click="removeFromCarrinho"(item.produto.produtoId")"><span class="glyphicon glyphicon-remove"></span>Remover</a></td>
                     </tr>
                     <tr>
                        <th></th>
                        <th></th>
                        <th>Total Compra: </th>
                        <th>{{ calGrandTotal() }}</th>
                        <th></th>
                     </tr>     
                </table>
                
                <a href="<spring:url value="/produtoLista" />" class="bt btn-default">Continue Compras</a>
            </div>
        </section>
<script src="<c:url value="/resources/js/controller.js?v3" /> "> </script>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>