package abstractfabric.domain.web;

import abstractfabric.domain.entities.Input;

public class WebInput implements Input {
    private String value;

    @Override
    public void value(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public void render() {
        System.out.printf("render WebInput. With value %s%n", value);
    }
}