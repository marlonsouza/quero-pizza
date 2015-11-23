(function() {
  'use strict';

  angular
    .module('client')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider

      .state('app',
        {
          url: '/login',
          templateUrl: 'app/login/login.html',
          controller: 'LoginController',
          controllerAs: 'vm'
        }
      )
      .state('registrar-usuario',{
        url: '/registrando-usuario',
        templateUrl: 'app/login/registrar-usuario.html',
        controller: 'RegistrarUsuarioController',
        controllerAs: 'vm'
      })
      .state('pizzarias', {
        url: '/pizzarias',
        templateUrl: 'app/pizzarias/pizzarias.html',
        controller: 'PizzariaController',
        controllerAs: 'vm'
      })
      .state('cadastro-pizzaria', {
        url: '/cadastro-pizzaria',
        templateUrl: 'app/pizzarias/cadastro-pizzaria.html',
        controller: 'CadastroPizzariaController',
        controllerAs: 'vm'
      })
      .state('cardapio', {
        url: '/cardapio-pizzaria',
        templateUrl: 'app/cardapio/cardapio.html',
        controller: 'CardapioController',
        controllerAs: 'vm',
        params:{
          pizzaria: null
        }
      })
      .state('nova-pizza', {
        url: '/nova-pizza',
        templateUrl: 'app/cardapio/nova-pizza.html',
        controller: 'NovaPizzaController',
        controllerAs: 'vm'
      });

    $urlRouterProvider.otherwise('/login');
  }

})();
