package lab1fabric.data;

import lab1fabric.domain.Button;

public class MobDialog extends AbstractDialog {
    Button getButton() {
        return new MobButton();
    }
}
