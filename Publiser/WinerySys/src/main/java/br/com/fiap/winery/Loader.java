package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        String urlStock = "http://localhost:8085/WineStockService";
        String urlWarning = "http://localhost:8086/WineWarningService";

        Endpoint.publish(urlStock, wineStock);
        Endpoint.publish(urlWarning, wineWarning);
        System.out.println("Serviço publicado");
    }
}
