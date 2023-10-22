package lab1fabricabstract.domain;

import lab1fabricabstract.domain.entities.Button;
import lab1fabricabstract.domain.entities.Checkbox;
import lab1fabricabstract.domain.entities.Input;

public interface FormElementFactory {
    Button createButton();

    Checkbox createCheckbox();

    Input createInput();
}