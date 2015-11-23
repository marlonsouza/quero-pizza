'use strict';

(function () {

    angular.module('app.cardapio')
        .controller('NovaPizzaController', NovaPizzaController);

    NovaPizzaController.$inject = ['$injector', '$state'];

    function NovaPizzaController($injector,$state) {
        var vm = this;
        var cardapio;

        var TransferService = $injector.get('TransferService');
        var CardapioService = $injector.get('CardapioService');

        vm.save = save;
        vm.setTamanhoPizza = setTamanhoPizza;
        vm.pizza = {};

        init();

        function init(){
          cardapio = TransferService.getModel();
        }

        function save(pizza){
          if(!cardapio.pizzas){
            cardapio.pizzas = [];
          }

          cardapio.pizzas.push(pizza);

          CardapioService.save(cardapio).then(function(data){
            TransferService.setModel(data);
            $state.go('cardapio');
          });

        }

        function setTamanhoPizza(tamanho){
          vm.tamanhoSelectionado = tamanho;
          vm.pizza.tamanho = tamanho;
        }
    }

})();
