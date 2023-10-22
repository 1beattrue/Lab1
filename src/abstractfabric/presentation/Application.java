package abstractfabric.presentation;

import abstractfabric.domain.AbstractFabricService;

class Application {
    public static void main(String[] args) {
        AbstractFabricService service = new AbstractFabricService();
        service.exec();
    }
}