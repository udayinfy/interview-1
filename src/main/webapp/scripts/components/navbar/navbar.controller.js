'use strict';

angular.module('interviewApp')
    .controller('NavbarController', function ($scope, $location, $state) {
        $scope.$state = $state;
    });
