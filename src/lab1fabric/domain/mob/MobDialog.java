package lab1fabric.domain.mob;

import lab1fabric.domain.entities.AbstractDialog;
import lab1fabric.domain.entities.Button;

public class MobDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new MobButton();
    }
}
