"use strict";

angular.module("interviewApp")
    .config(function ($stateProvider) {
        $stateProvider
            .state("person", {
                parent: "site",
                url: "/person",
                data: {
                    pageTitle: "Persons"
                },
                views: {
                    "content@": {
                        templateUrl: "scripts/app/person/persons.html",
                        controller: "PersonController"
                    }
                }
            })
            .state("personDetail", {
                parent: "site",
                url: "/person/:id",
                data: {
                    pageTitle: "Person"
                },
                views: {
                    "content@": {
                        templateUrl: "scripts/app/person/person-detail.html",
                        controller: "PersonDetailController"
                    }
                }
            });
    });
