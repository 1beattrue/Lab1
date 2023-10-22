package abstractfabric.domain;

import abstractfabric.domain.entities.Button;
import abstractfabric.domain.entities.Checkbox;
import abstractfabric.domain.entities.Input;

public interface FormElementFactory {
    Button createButton();

    Checkbox createCheckbox();

    Input createInput();
}