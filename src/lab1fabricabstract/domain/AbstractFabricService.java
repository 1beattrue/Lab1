package lab1fabricabstract.domain;

import lab1fabricabstract.domain.entities.Button;
import lab1fabricabstract.domain.entities.Input;
import lab1fabricabstract.domain.mob.MobFormElementFactory;
import lab1fabricabstract.domain.web.WebFormElementFactory;
import org.jetbrains.annotations.NotNull;

import static lab1fabricabstract.domain.Configuration.MOB;
import static lab1fabricabstract.domain.Configuration.WEB;

public class AbstractFabricService {
    private FormElementFactory initFactory() {
        Configuration configuration = Configuration.initWeb();
        FormElementFactory factory;
        switch (configuration.getPlatform()) {
            case (WEB) -> factory = new WebFormElementFactory();
            case (MOB) -> factory = new MobFormElementFactory();
            default -> throw new RuntimeException("Неизвестный тип платформы");
        }
        return factory;
    }

    private void renderForm(@NotNull FormElementFactory factory) {
        Input input = factory.createInput();
        Button button = factory.createButton();
        input.value("Тестовое значение поля ввода данных");
        input.render();
        button.render();
    }

    public void exec() {
        renderForm(
                initFactory()
        );
    }
}
