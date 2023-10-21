package lab1fabric.data;

import lab1fabric.domain.Button;
import lab1fabric.domain.Dialog;

public abstract class AbstractDialog implements Dialog {
    abstract Button getButton();

    public void render() {
        Button button = getButton();
        button.render();
    }
}