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

    $scope.calcPrecoTotal = function(){
        var totalGeral = 0;

        for (var i = 0; i < $scope.carrinho.carrinhoItens.length; i++){
            totalGeral += $scope.carrinho.carrinhoItens[i].precoTotal;
        }

        return totalGeral;
    }
});