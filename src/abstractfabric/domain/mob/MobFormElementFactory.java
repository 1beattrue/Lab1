package abstractfabric.domain.mob;

import abstractfabric.domain.entities.Button;
import abstractfabric.domain.entities.Checkbox;
import abstractfabric.domain.FormElementFactory;
import abstractfabric.domain.entities.Input;

public class MobFormElementFactory implements FormElementFactory {
    @Override
    public Button createButton() {
        return new MobButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MobCheckbox();
    }

    @Override
    public Input createInput() {
        return new MobInput();
    }
}
