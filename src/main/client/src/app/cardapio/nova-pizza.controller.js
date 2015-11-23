'use strict';

(function () {

    angular.module('app.cardapio')
        .controller('NovaPizzaController', NovaPizzaController);

    NovaPizzaController.$inject = ['$scope', '$state'];

    function NovaPizzaController($scope,$state) {
        var vm = this;

        vm.save = save;
        vm.setTamanhoPizza = setTamanhoPizza;
        vm.pizza = {};

        function save(pizza){
          $scope.$broadcast('REFRESH::CARDAPIO',pizza);
          $state.go('cardapio');
        }

        function setTamanhoPizza(tamanho){
          vm.tamanhoSelectionado = tamanho;
          vm.pizza.tamanho = tamanho;
        }
    }

})();
