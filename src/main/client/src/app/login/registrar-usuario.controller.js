'use strict';

(function () {

    angular.module('app.login')
        .controller('RegistrarUsuarioController', RegistrarUsuarioController);

    RegistrarUsuarioController.$inject = ['$injector', '$state'];

    function RegistrarUsuarioController($injector, $state) {
        var vm = this;
        var LoginService = $injector.get('LoginService');

        vm.cadastrarUsuario = cadastrarUsuario;

        function cadastrarUsuario(usuario){
          LoginService.register(usuario).then(function(logado){
            if(logado){
              $state.go('pizzarias');
            }
          });
        }
    }

})();
