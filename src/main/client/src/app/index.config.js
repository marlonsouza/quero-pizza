(function() {
  'use strict';

  angular
    .module('client')
    .config(config)
    .run(configRestangular);

  /** @ngInject */
  function config($logProvider, toastrConfig) {
    // Enable log
    $logProvider.debugEnabled(true);

    // Set options third-party lib
    toastrConfig.allowHtml = true;
    toastrConfig.timeOut = 3000;
    toastrConfig.positionClass = 'toast-top-right';
    toastrConfig.preventDuplicates = true;
    toastrConfig.progressBar = true;

  }

  configRestangular.$inject = ['Restangular'];

  function configRestangular(Restangular){

    Restangular.setBaseUrl('http://localhost:8080/queroPizza/api');

    Restangular.setDefaultHeaders({
      'Content-Type':'application/json',
      'Accept': 'application/json'
    });
  }

})();
