package lab1fabric.domain.mob;

import lab1fabric.domain.entities.Button;

class MobButton implements Button {
    @Override
    public void render() {
        System.out.println("render MobButton");
    }
}
