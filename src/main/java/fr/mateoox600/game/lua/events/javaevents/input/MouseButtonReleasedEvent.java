package fr.mateoox600.game.lua.events.javaevents.input;

import fr.mateoox600.game.Main;
import fr.mateoox600.game.lua.events.EventUpdateHelper;
import fr.mateoox600.game.lua.events.JavaEvent;

public class MouseButtonReleasedEvent extends JavaEvent {

    private final Main main = Main.getInstance();

    public MouseButtonReleasedEvent() {
        super("mouseButtonReleased");
    }

    @Override
    public void update(EventUpdateHelper event) {
        for (int button = 0; button < 3; button++) {
            if(main.rayLibManager.raylib.core.IsMouseButtonReleased(button)) {
                event.trigger((double) button);
            }
        }
    }

}
