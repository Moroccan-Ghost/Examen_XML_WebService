import jakarta.xml.ws.Endpoint;
import operationServices.ReleveService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new ReleveService());
        System.out.println("Web Service Started at http://localhost:9191/ ! ");
    }
}
