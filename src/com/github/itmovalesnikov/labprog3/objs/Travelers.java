package com.github.itmovalesnikov.labprog3.objs;

import com.github.itmovalesnikov.labprog3.locations.Door;
import com.github.itmovalesnikov.labprog3.locations.Location;
import com.github.itmovalesnikov.labprog3.locations.TransitionException;

public class Travelers extends PhysicalObject {
    @Override
    public void interact() {
        dressUp();
        washUp();
        brushTeeth();
        haveBreakfast();
        goWalk();
    }

    public void dressUp() {
        System.out.println("Путешественики оделись");
    }
    public void washUp() {
        System.out.println("Путешественики умылись");
    }
    public void brushTeeth() {
        System.out.println("Путешественики почистили зубы");
    }
    public void haveBreakfast() {
        System.out.println("Путешественики позавтракали");
    }
    public void goWalk() {
        System.out.println("Путешественники решили прогуляться по городу");
    }

    public void goOut(Door door, Location current) {
        move(door.getPosition());
        current.getObjetcs().remove(this);
        System.out.println("Путешественники спустились по лестнице");
        try {
            door.getNextLocation().getObjetcs().add(this);
            move(door.getNextLocationPos());
            System.out.println("Путешественники вышли из гостиницы");

        } catch (TransitionException ex) {
            System.out.println("Путешественникам не удалось выйти: \n" + ex);
        }

    }

    public void lookAround() {
        System.out.println("Путешественики увидели, что на улице уже было много прохожих");
    }
}
