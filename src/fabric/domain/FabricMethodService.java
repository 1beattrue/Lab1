package fabric.domain;

import fabric.domain.entities.Dialog;
import fabric.domain.mob.MobDialog;
import fabric.domain.web.WebDialog;

import static fabric.domain.Configuration.MOB;
import static fabric.domain.Configuration.WEB;

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
