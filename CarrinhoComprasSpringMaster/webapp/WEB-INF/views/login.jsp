<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
  <div class="container">
    <div id="login-box">
        <h2>Entrar com seu Usuário e Senha</h2>
        
        <c:if test="${not empty msg }">
           <div class="msg">${ msg }</div>
        </c:if>
        
        <form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
        
            <c:if test="${not empty error }">
              <div class="error" style="color: #ff0000;">${error }</div>
            </c:if>
            
            <div class="form-group">
               <label for="usuarionome">Usuário: </label>
               <input type="text" id="usuarionome" name="usuarionome" class="form-control" />
            </div>
            
            <div class="Form-group">
               <label for="password">Password: </label>
               <input type="password" id="senha" name="senha" class="form-control" />
            </div>
            
            <input type="submit" value="Submit" class="btn btn-default" />
            <input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }" />
        </form>
    </div>
  </div>
</div>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>