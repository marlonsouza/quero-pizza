'use strict';

(function () {

    angular.module('app.cardapio')
        .controller('CardapioController', CardapioController);

    CardapioController.$inject = ['$injector', '$scope'];

    function CardapioController($injector, $scope) {
        var vm = this;
        var CardapioService = $injector.get('CardapioService');

        vm.montarPedido = montarPedido;
        vm.saveCardapio = saveCardapio;

        init();

        function init(){
          vm.pizzaria = CardapioService.getPizzaria();

          CardapioService.get().then(function(data){
            vm.cardapio = data || {};
          });
        }

        function saveCardapio(cardapio){
          CardapioService.save(cardapio).then(function(data){
            vm.cardapio = data;
          });
        }

        function montarPedido(){

        }

        $scope.$on('REFRESH::CARDAPIO', function(event, data){
          saveCardapio(data);
        });
    }

})();
