package lab1fabricabstract.domain.web;

import lab1fabricabstract.domain.entities.Button;

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
