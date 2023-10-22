package lab1fabric.domain.web;

import lab1fabric.domain.entities.AbstractDialog;
import lab1fabric.domain.entities.Button;

public class WebDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new WebButton();
    }
}
