package builder.presentation;

import builder.domain.BuilderService;

public class Application {
    public static void main(String[] args) {
        BuilderService service = new BuilderService();
        service.exec();
    }
}
