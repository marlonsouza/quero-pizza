'use strict';

(function () {

    angular.module('app.login')
        .factory('LoginService', LoginService);

    LoginService.$inject = ['$q'];

    function LoginService($q) {
        var self = {};
        var user;
        var users = [];

        self.isLogged = isLogged;
        self.login = login;
        self.register = register;


        function isLogged(){
          return $q.when(user !== null);
        }

        function isValid(validateUser){
          return users.some(function(user){
            return user.senha === validateUser.senha && user.usuario === validateUser.usuario;
          });
        }

        function login(userToLogin){
          if(isValid(userToLogin)){
            user = userToLogin;
            return $q.when(true);
          }

          return $q.when(false);
        }

        function register(user){
          users.push(user);
          return login(user);
        }

        return self;
    }

})();
