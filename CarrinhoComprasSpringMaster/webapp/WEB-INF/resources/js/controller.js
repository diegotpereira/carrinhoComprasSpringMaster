var carrinhoApp = angular.module ("carrinhoApp", []);

carrinhoApp.controller("carrinhoCtrl", function($scope, $http){

    $scope.refreshCart = function(){
       $http.get('/rest/carrinho/' + $scope.carrinhoId).success(function (data){
           $scope.carrinho = data;
       });
    };

    $scope.clearCart = function(){
        $http.delete('/rest/carrinho/' + $scope.carrinhoId).success($scope.refreshCart());
    };

    $scope.initCartId = function(carrinhoId){
        $scope.carrinhoId = carrinhoId;
        $scope.refreshCart(carrinhoId);
    };

    $scope.addToCart = function(produtoId){
        $http.put('/rest/carrinho/adicionar/' + produtoId).success(function (){
            alert('Produto adicionado com sucesso ao carrinho!');
        });
    };

    $scope.removeFromCart = function(produtoId){
        $http.put('/rest/carrinho/remove/' + produtoId).success(function(data){
           $scope.refreshCart();
        });
    };

    $scope.calGrandTotal = function(){
        var grandTotal = 0;

        for (var i = 0; i < $scope.carrinho.cartItems.length; i++){
            grandTotal += $scope.carrinho.cartItems[i].totalPrice;
        }

        return grandTotal;
    }
});