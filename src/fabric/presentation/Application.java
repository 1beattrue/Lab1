package fabric.presentation;

import fabric.domain.FabricMethodService;

class Application {
    public static void main(String[] args) {
        FabricMethodService service = new FabricMethodService();
        service.exec();
    }
}