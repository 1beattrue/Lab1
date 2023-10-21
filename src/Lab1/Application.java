package Lab1;

import Lab1.model.SingletonService;

class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    }
}