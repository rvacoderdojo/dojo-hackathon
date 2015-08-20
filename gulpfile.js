var gulp = require('gulp'),
    connect = require('gulp-connect');

gulp.task('server', function () {
    connect.server({
 		root: "src/",
        port: 9000,
        livereload : true,
        debug : true,
        middleware: function (connect, opt) {
            return [
                mock.proxyApi(baseUrl, baseRoute),
            ];
        }
    });
});

var baseUrl = 'http://localhost:8080/edison/';
var baseRoute = '/';

function proxyApi(baseUrl, baseRoute) {
    var proxyUrl= (baseUrl || 'http://localhost:8080');
    var options = url.parse(proxyUrl);
    options.route = baseRoute;

    return proxy(options);
}

