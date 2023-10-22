package lab1fabricabstract.presentation;

import lab1fabricabstract.domain.AbstractFabricService;

class Application {
    public static void main(String[] args) {
        AbstractFabricService service = new AbstractFabricService();
        service.exec();
    }
}