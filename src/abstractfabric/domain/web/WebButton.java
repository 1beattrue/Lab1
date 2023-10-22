package abstractfabric.domain.web;

import abstractfabric.domain.entities.Button;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("render WebButton");
    }

    @Override
    public void onClick() {
        System.out.println("Event on click WebButton");
    }
}
