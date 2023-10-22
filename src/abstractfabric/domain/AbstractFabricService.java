package abstractfabric.domain;

import abstractfabric.domain.entities.Button;
import abstractfabric.domain.entities.Input;
import abstractfabric.domain.mob.MobFormElementFactory;
import abstractfabric.domain.web.WebFormElementFactory;
import org.jetbrains.annotations.NotNull;

import static abstractfabric.domain.Configuration.MOB;
import static abstractfabric.domain.Configuration.WEB;

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
