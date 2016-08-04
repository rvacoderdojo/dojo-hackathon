/*
 * A stubbed toastr instance
 */
(function() {
    'use strict';

    angular
        .module('toastr')
        .factory('toastr', toastr);

    function toastr() {
        var service = {
            error : noop,
            info : noop,
            success : noop,
            warning : noop
        };

        return service;

        function noop() {
            return;
        }
    }
}());