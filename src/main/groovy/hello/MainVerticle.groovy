import io.vertx.lang.groovy.GroovyVerticle

class MainVerticle extends GroovyVerticle {

  @Override
  void start() throws Exception {
	println "Starting"
    // create router
    def router = Router.router(vertx)

    // add a route
    router.route().path("/").handler({ routingContext ->
      def response = routingContext.response()
      response.putHeader("content-type", "text/plain")
      response.end("Hello World!")
    })

    vertx.createHttpServer().requestHandler(router.&accept).listen(8080)
    println "Started on port",8080
  }

  @Override
  void stop() throws Exception {
    println "Stopping"
  }
}
