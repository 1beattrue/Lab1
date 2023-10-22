package lab1fabricabstract.domain.mob;

import lab1fabricabstract.domain.entities.Button;
import lab1fabricabstract.domain.entities.Checkbox;
import lab1fabricabstract.domain.FormElementFactory;
import lab1fabricabstract.domain.entities.Input;

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
