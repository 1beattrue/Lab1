package lab1fabricabstract.domain.entities;

public interface Checkbox {
    void render();

    Checkbox state(boolean state);

    boolean state();
}