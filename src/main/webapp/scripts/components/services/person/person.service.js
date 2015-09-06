"use strict";

angular.module("interviewApp")
    .factory("Person", function ($resource) {
        return $resource("api/persons/:id", {}, {
            "query": { method: "GET", isArray: true },
            "get": {
                method: "GET",
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            "update": { method:"PUT" }
        });
    });
