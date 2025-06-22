package ir.digixo.ws.client;

import ir.digixo.hellows.ws.HelloWs;
import ir.digixo.hellows.ws.HelloWsService;

import java.net.MalformedURLException;
import java.net.URL;

public class WSClient {

    public static void main(String[] args) throws MalformedURLException {

        HelloWsService service = new HelloWsService(new URL("http://localhost:8080/ws/hello?wsdl"));
        final HelloWs helloWsPort = service.getHelloWsPort();
        final String s = helloWsPort.hello("Soap Web Service");
        System.out.println(s);
    }
}
