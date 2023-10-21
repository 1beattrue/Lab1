package lab1fabric.domain;

import lab1fabric.data.MobDialog;
import lab1fabric.data.WebDialog;

import static lab1fabric.domain.Configuration.MOB;
import static lab1fabric.domain.Configuration.WEB;

public class FabricMethodService {
    public void exec() {
        Configuration configuration = Configuration.initMob();
        Dialog dialog;
        switch (configuration.getPlatform()) {
            case WEB -> dialog = new WebDialog();
            case MOB -> dialog = new MobDialog();
            default -> throw new RuntimeException("Неизвестный тип платформы");
        }
        dialog.render();
    }
}
