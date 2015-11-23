'use strict';

(function () {

    angular.module('app.cardapio')
        .factory('CardapioService', CardapioService);

    CardapioService.$inject = ['Restangular'];

    function CardapioService(Restangular) {
        var service = {};
        var self = this;

        service.setPizzaria = setPizzaria;
        service.getPizzaria = getPizzaria;
        service.get = get;
        service.save = save;

        function setPizzaria(toPizzaria){
          self.pizzaria = toPizzaria;
        }

        function getPizzaria(){
          return self.pizzaria;
        }

        function get(){
          return Restangular.one('pizzaria', self.pizzaria.id).one('cardapio').get();
        }

        function save(cardapio){
          cardapio.pizzaria = self.pizzaria;

          var transaction = Restangular.one('pizzaria', self.pizzaria.id).all('cardapio');

          return cardapio.id ? transaction.put(cardapio) : transaction.post(cardapio);

        }

        return service;
    }

})();
