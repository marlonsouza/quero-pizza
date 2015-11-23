'use strict';

(function () {

    angular.module('app.login')
        .controller('LoginController', LoginCtrl);

    LoginCtrl.$inject = ['$injector', '$state'];

    function LoginCtrl($injector, $state) {
        var vm = this;
        var LoginService = $injector.get('LoginService');

        vm.logar = logar;
        vm.registrarUsuario = registrarUsuario;
        vm.usuario = {};

        function logar(usuario){

          LoginService.login(usuario).then(function(isLogged){
            if(isLogged){
              $state.go('pizzarias');
            }else{
              alert("Usuário/Senha Inválidos!");
            }
          });
        }

        function registrarUsuario(){
          $state.go('registrar-usuario');
        }

    }

})();

