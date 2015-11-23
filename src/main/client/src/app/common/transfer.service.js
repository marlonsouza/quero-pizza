'use strict';

(function () {

    angular.module('client')
        .factory('TransferService', TransferService);

    TransferService.$inject = [];

    function TransferService() {
        var self = {};
        var model;

        self.setModel = setModel;
        self.getModel = getModel;

        function setModel(toModel){
          model = toModel;
        }

        function getModel(){
          return model;
        }

        return self;
    }

})();
