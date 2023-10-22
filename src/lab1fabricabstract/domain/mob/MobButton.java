package lab1fabricabstract.domain.mob;

import lab1fabricabstract.domain.entities.Button;

class MobButton implements Button {
    @Override
    public void render() {
        System.out.println("render MobButton");
    }

    @Override
    public void onClick() {
        System.out.println("Event on click MobButton");
    }
}