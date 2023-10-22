package fabric.domain.mob;

import fabric.domain.entities.Button;

class MobButton implements Button {
    @Override
    public void render() {
        System.out.println("render MobButton");
    }
}
