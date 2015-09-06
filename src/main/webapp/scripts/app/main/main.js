"use strict";

angular.module("interviewApp")
    .config(function ($stateProvider) {
        $stateProvider
            .state("home", {
                parent: "site",
                url: "/",
                views: {
                    "content@": {
                        templateUrl: "scripts/app/main/main.html",
                        controller: "MainController"
                    }
                }
            });
    });
