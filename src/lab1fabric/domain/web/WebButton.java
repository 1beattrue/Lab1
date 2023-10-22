package lab1fabric.domain.web;

import lab1fabric.domain.entities.Button;

class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("render WebButton");
    }
}
