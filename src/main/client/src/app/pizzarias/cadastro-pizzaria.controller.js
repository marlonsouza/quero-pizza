'use strict';

(function () {

    angular.module('app.pizzaria')
        .controller('CadastroPizzariaController', CadastroPizzariaController);

    CadastroPizzariaController.$inject = ['$injector', '$state'];

    function CadastroPizzariaController($injector, $state) {
        var vm = this;

        var PizzariaService = $injector.get('PizzariaService');

        vm.pizzaria = {};
        vm.cadastrar = cadastrar;

        function cadastrar(pizzaria){
          PizzariaService.insert(pizzaria).then(function(){
            vm.pizzaria = {};
            vm.form.$setPristine();
            alert('Pizzaria Cadastrada com Sucesso!');
            $state.go('pizzarias');
          });
        }
    }

})();
