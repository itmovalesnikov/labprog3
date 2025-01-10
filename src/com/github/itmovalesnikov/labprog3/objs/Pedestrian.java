package com.github.itmovalesnikov.labprog3.objs;

import java.util.Random;

public class Pedestrian extends PhysicalObject {
    Newspaper newspaper;
    PedestrianState state;

    public Pedestrian() {
        this(null);
    }

    public Pedestrian(Newspaper newspaper) {
        this.newspaper = newspaper;
        if (newspaper == null) {
            state = PedestrianState.GO_TO_KIOSK;
        } else {
            PedestrianState[] values = PedestrianState.values();
            Random random = new Random();
            int randomIndex = random.nextInt(values.length);
            state = values[randomIndex];
        }
    }

    @Override
    public void interact() {
        switch (state) {
            case SIT_ON_BENCH:
                System.out.println("Прохожий читает газету, сидя на лавочке");
                break;
            case STOP_ON_SIDEWALK:
                System.out.println("Прохожий читает газету, остановившись прямо посреди тротуара");
                break;
            case READ_ON_WALK:
                System.out.println("Прохожий читает газету на ходу");
                break;
            case GO_TO_KIOSK:
                System.out.println("Мчится наперегонки к газетному киоску");
                break;
        }
    }

    public PedestrianState getState() {
        return state;
    }
}
