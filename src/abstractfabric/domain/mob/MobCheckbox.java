package abstractfabric.domain.mob;

import abstractfabric.domain.entities.Checkbox;

class MobCheckbox implements Checkbox {
    private boolean state;

    @Override
    public void render() {
        System.out.printf("render MobCheckbox. With state %s%n", state);
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