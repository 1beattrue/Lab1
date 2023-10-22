package abstractfabric.domain.web;

import abstractfabric.domain.entities.Checkbox;

public class WebCheckbox implements Checkbox {
    private boolean state;

    @Override
    public void render() {
        System.out.printf("render WebCheckbox. With state %s%n", state);
    }

    @Override
    public boolean state() {
        return state;
    }

    @Override
    public Checkbox state(boolean state) {
        this.state = state;
        return this;
    }
}