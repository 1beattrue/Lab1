package fabric.domain.mob;

import fabric.domain.entities.AbstractDialog;
import fabric.domain.entities.Button;

public class MobDialog extends AbstractDialog {
    @Override
    public Button getButton() {
        return new MobButton();
    }
}
