var gulp = require('gulp'),
    connect = require('gulp-connect'),
    proxy = require('proxy-middleware'),
    url = require('url');

gulp.task('server', function () {
    connect.server({
 		root: "src/",
        port: 9000,
        livereload : true,
        debug : true,
        middleware: function (connect, opt) {
            return [
                proxyApi(baseUrl, baseRoute),
            ];
        }
    });
});

var baseUrl = 'http://localhost:8080/api/';
var baseRoute = '/api';

function proxyApi(baseUrl, baseRoute) {
    var proxyUrl= (baseUrl || 'http://localhost:8080');
    var options = url.parse(proxyUrl);
    options.route = baseRoute;

    return proxy(options);
}

