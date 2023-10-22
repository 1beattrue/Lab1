package singleton.presentation;

import singleton.domain.SingletonService;

class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    }
}