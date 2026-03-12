package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService{
    @Override
    public String getMenu() {
        return  "------------------ Menu ------------------ \n" +
                "Escolha seu tipo de vinho: \n" +
                "1- Tintos: Cabernet Sauvignon, Merlot, Malbec\n" +
                "2- Brancos: Chardonnay, Sauvignon Blanc\n" +
                "3- Rosés: Provence, Grenache";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
