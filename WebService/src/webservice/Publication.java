package webservice;

import javax.xml.ws.Endpoint;

public class Publication {

    public static void main(String[] args) {
        String url = "http://localhost:8282/" ;
        Conversion c = new Conversion();
        Endpoint.publish(url,c);
        System.out.println("Votre Service est publié ");
        System.out.println("L'adresse du WSD est:"+url+"?wsdl");
    }
}
