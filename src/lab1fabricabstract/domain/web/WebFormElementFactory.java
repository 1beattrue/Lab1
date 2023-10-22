package lab1fabricabstract.domain.web;

import lab1fabricabstract.domain.entities.Button;
import lab1fabricabstract.domain.entities.Checkbox;
import lab1fabricabstract.domain.FormElementFactory;
import lab1fabricabstract.domain.entities.Input;

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
