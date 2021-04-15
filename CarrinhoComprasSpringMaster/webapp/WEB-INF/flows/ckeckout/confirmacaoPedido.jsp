<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<jsp:useBean id="now" class="java.util.Date" />

<div class="container-wrapper">
   <div class="container">
      <div class="page-header">
         <h1>Pedido</h1>
         
         <p class="lead">Confirmação do Pedido</p>
      </div>
      
      <div class="container">
         <div class="row">
            <form:form commandName="pedido" class="form-horizontal" >
                <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">
                    <div class="txt-center">
                       <h1>Recibo</h1>
                    </div>
                    
                    <div class="row">
                       <div class="col-xs-6 col-sm-6 col-md-6">
                          <address>
                             <strong>Endereço de Entrega</strong><br/>
                             ${pedido.carrinho.cliente.enderecoEntrega.ruaNome}
                          <br/>
                             ${pedido.carrinho.cliente.enderecoEntrega.cidade}, ${pedido.carrinho.cliente.enderecoEntrega.estado}
                          <br/>
                             ${pedido.carrinho.cliente.enderecoEntrega.pais }, ${pedido.carrinho.cliente.enderecoEntrega.cep}
                          </address>
                       </div>
                       
                       <div class="col-xs-6 col-sm-6 col-md-6 text-right">
                          <p>Data de Entrega: <fmt:formatDate type="date" value="${now}" /></p>
                       </div>
                    </div>
                    
                    <div class="row">
                       <div class="col-xs-6 col-sm-6 col-md-6">
                           <address>
                              <strong>Endereço de Cobrança</strong><br/>
                                  ${pedido.carrinho.cliente.enderecoCobranca.ruaNome}
                              <br/>
                                  ${pedido.carrinho.cliente.enderecoCobranca.cidade}, ${pedido.carrinho.cliente.enderecoCobranca.estado}
                              <br/>
                                  ${pedido.carrinho.cliente.enderecoCobranca.pais}, ${pedido.carrinho.cliente.enderecoCobranca.cep}        
                           </address>
                       </div>
                    </div>
                    
                    <div class="row">
                       <table class="table table-hover">
                           <thead>
                              <tr>
                                 <td>Produto</td>
                                 <td>#</td>
                                 <td class="text-center">Preço</td>
                                 <td class="text-center">Total</td>
                              </tr>
                           </thead>
                           
                           <tbody>
                           
                           <c:forEach var="carrinhoItem" items="${pedido.carrinho.carrinhoItems}">
                               <tr>
                                  <td class="col-md-9"><em>${carrinhoItem.produto.produtoNome }</em></td>
                                  <td class="col-md-1" style="text-align: center">${carrinhoItem.quantidade}</td>
                                  <td class="col-md-1" style="text-align: center">${carrinhoItem.produto.produtoPreco}</td>
                                  <td class="col-md-1" style="text-align: center">${carrinhoItem.precoTotal}</td>
                               </tr>   
                           </c:forEach>
                           
                           <tr>
                              <td></td>
                              <td></td>
                              <td class="text-right">
                                  <h4><strong>Preço Total</strong></h4>
                              </td>
                              
                              <td class="text-center text-danger">
                                 <h4><strong>$ ${pedido.carrinho.precoTotal}</strong></h4> 
                              </td>
                              <td  class="text-center text-danger">
                                  <h4><strong>$ ${pedido.carrinho.precoTotal}</strong></h4>
                              </td>
                            </tr>         
                           </tbody>      
                       </table>
                    </div>
                    
                    <input type="hidden" name="_flowExecutionKey" />
                    
                    <br/><br/>
                    
                    <button class="btn btn-default" name="_eventId_voltarParaCollectEntregaDetalhe">Voltar</button>
                    
                    <input type="submit pedido" class="btn btn-default" name="_eventId_PedidoConfirmado" />
                    
                    <button class="btn btn-default" name="_eventId_cancel">Cancel</button>
                </div>
                
            </form:form>
         </div>
      </div>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>