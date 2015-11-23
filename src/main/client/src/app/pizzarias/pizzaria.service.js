'use strict';

(function () {

    angular.module('app.pizzaria')
        .factory('PizzariaService', PizzariaService);

    PizzariaService.$inject = ['Restangular'];

    function PizzariaService(Restangular) {
        var self = {};

        self.listAll = listAll;
        self.insert = insert;

        function listAll(){
          return Restangular.all('pizzaria').getList();
        }

        function insert(pizzaria){
          return Restangular.all('pizzaria').post(pizzaria);
        }

        return self;
    }

})();
