import io.vertx.core.Vertx

class Server {
    static void main(String[] args) {
        
        def vertx = Vertx.vertx
        vertx.deployVerticle(new hello.MainVerticle())
    }
}
