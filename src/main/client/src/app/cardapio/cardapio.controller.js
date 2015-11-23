'use strict';

(function () {

    angular.module('app.cardapio')
        .controller('CardapioController', CardapioController);

    CardapioController.$inject = ['$injector', '$state'];

    function CardapioController($injector, $state) {
        var vm = this;
        var CardapioService = $injector.get('CardapioService');
        var TransferService = $injector.get('TransferService');

        vm.montarPedido = montarPedido;
        vm.saveCardapio = saveCardapio;
        vm.addPizza = addPizza;

        init();

        function init(){
          vm.pizzaria = CardapioService.getPizzaria();

          CardapioService.get().then(function(data){
            vm.cardapio = data || {};
          });
        }

        function addPizza(){
          TransferService.setModel(vm.cardapio);
          $state.go('nova-pizza');
        }

        function saveCardapio(cardapio){
          CardapioService.save(cardapio).then(function(data){
            vm.cardapio = data;
          });
        }

        function montarPedido(){

        }

    }

})();
