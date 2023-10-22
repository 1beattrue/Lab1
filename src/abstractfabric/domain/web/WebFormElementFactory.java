package abstractfabric.domain.web;

import abstractfabric.domain.entities.Button;
import abstractfabric.domain.entities.Checkbox;
import abstractfabric.domain.FormElementFactory;
import abstractfabric.domain.entities.Input;

public class WebFormElementFactory implements FormElementFactory {
    @Override
    public Button createButton() {
        return new WebButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WebCheckbox();
    }

    @Override
    public Input createInput() {
        return new WebInput();
    }
}
