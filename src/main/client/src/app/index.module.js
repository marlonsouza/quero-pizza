(function() {
  'use strict';

  angular
    .module('client', [
      'restangular',
      'ui.router',
      'ui.bootstrap',
      'toastr',
      'app.login',
      'app.pizzaria',
      'app.cardapio'
    ]);

})();
