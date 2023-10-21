package lab1singleton.presentation;

import lab1singleton.domain.SingletonService;

class Application {
    public static void main(String[] args) {
        SingletonService service = new SingletonService();
        service.exec();
    }
}