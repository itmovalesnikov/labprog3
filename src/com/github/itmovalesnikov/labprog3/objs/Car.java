package com.github.itmovalesnikov.labprog3.objs;

import com.github.itmovalesnikov.labprog3.forms.Circle;
import com.github.itmovalesnikov.labprog3.forms.Position;
import com.github.itmovalesnikov.labprog3.locations.Room;

public class Car extends PhysicalObject implements Cleaner {

    public Car() {
        super(new Circle(0.15f), new Position(0, 0));
    }

    @Override
    public void clean(Room room) {
        // cleaning
        System.out.println("Машина окончила уборку");
        goRoomCenter(room);
        rotate();
        goToDoor(room);
    }

    @Override
    public void interact() {
    }

    private void goRoomCenter(Room room) {
        move(room.getForm().getCenter());
        System.out.println("Машина вылезла на середину комнаты");
    }

    private void rotate() {
        System.out.println("Машина покрутилась на месте, как бы оглядываясь по сторонам");
    }

    private void goToDoor(Room room) {
        move(room.getForm().getVertices()[0]);
        System.out.println(
                "Машина поползла в угол и скрылась за маленькой дверцей, которая имелась в стене у самого пола");
    }
}
