package lab1fabric.presentation;

import lab1fabric.domain.FabricMethodService;

class Application {
    public static void main(String[] args) {
        FabricMethodService service = new FabricMethodService();
        service.exec();
    }
}