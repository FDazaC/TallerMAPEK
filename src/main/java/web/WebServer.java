package web;

import io.javalin.Javalin;
import model.Content;

public class WebServer {
    public static void startServer() {
        //Se inicializa Javalin escuchando en el puerto 7000
        Javalin app = Javalin.create().start(7000);

        //Rutas definidas para conectarse con el controlador
        app.get("/content", ContentController::getContent);
        app.get("/status", ContentController::getStatus);
        app.get("/reset", ContentController::resetSystem);

        System.out.println("Servidor iniciado en http://localhost:7000");
    }
}
