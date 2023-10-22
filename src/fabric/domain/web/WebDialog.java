package fabric.domain.web;

import fabric.domain.entities.AbstractDialog;
import fabric.domain.entities.Button;

public class WebDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new WebButton();
    }
}
