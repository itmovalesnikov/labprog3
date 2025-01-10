package com.github.itmovalesnikov.labprog3.objs;

import java.util.Random;

public class Pedestrian extends PhysicalObject {
    private Newspaper newspaper;
    private PedestrianState state;

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
                System.out.println("Прохожий читает газету, сидя на лавочке: " + newspaper.read());
                break;
            case STOP_ON_SIDEWALK:
                System.out.println("Прохожий читает газету, остановившись прямо посреди тротуара: " + newspaper.read());
                break;
            case READ_ON_WALK:
                System.out.println("Прохожий читает газету на ходу: " + newspaper.read());
                break;
            case GO_TO_KIOSK:
                System.out.println("Прохожий мчится наперегонки к газетному киоску");
                break;
        }
    }

    public PedestrianState getState() {
        return state;
    }
}
