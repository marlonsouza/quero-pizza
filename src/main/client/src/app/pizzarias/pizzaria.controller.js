'use strict';

(function () {

    angular.module('app.pizzaria')
        .controller('PizzariaController', PizzariaController);

    PizzariaController.$inject = ['$injector', '$state'];

    function PizzariaController($injector, $state) {
        var vm = this;

        var PizzariaService = $injector.get('PizzariaService');
        var CardapioService = $injector.get('CardapioService');

        vm.pizzarias = {};
        vm.listarPizzarias = listarPizzarias;
        vm.selecionar = selecionar;

        listarPizzarias();

        function listarPizzarias(){
          var grouper = 0;
          PizzariaService.listAll().then(function(data){
             vm.pizzarias = _.chain(data)
               .map(function(pizzaria, id){

                 if((id+1)%4===0){
                   grouper++;
                 }
                 return angular.extend(pizzaria, {group: grouper});
               })
               .groupBy('group')
               .value();
          });
        }

        function selecionar(pizzaria){
          CardapioService.setPizzaria(pizzaria);
          $state.go('cardapio');
        }
    }

})();
