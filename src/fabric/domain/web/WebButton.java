package fabric.domain.web;

import fabric.domain.entities.Button;

class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("render WebButton");
    }
}
