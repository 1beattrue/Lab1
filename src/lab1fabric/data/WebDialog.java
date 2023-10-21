package lab1fabric.data;

import lab1fabric.domain.Button;

public class WebDialog extends AbstractDialog {
    Button getButton() {
        return new WebButton();
    }
}
