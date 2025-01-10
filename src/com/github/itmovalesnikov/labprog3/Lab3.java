package com.github.itmovalesnikov.labprog3;

import java.util.ArrayList;

import com.github.itmovalesnikov.labprog3.forms.Position;
import com.github.itmovalesnikov.labprog3.forms.Rectangle;
import com.github.itmovalesnikov.labprog3.locations.Door;
import com.github.itmovalesnikov.labprog3.locations.Location;
import com.github.itmovalesnikov.labprog3.locations.Room;
import com.github.itmovalesnikov.labprog3.objs.Car;
import com.github.itmovalesnikov.labprog3.objs.Cleaner;
import com.github.itmovalesnikov.labprog3.objs.Newspaper;
import com.github.itmovalesnikov.labprog3.objs.Pedestrian;
import com.github.itmovalesnikov.labprog3.objs.PhysicalObject;
import com.github.itmovalesnikov.labprog3.objs.Travelers;

public class Lab3 {
    public static void main(String[] args) {
        var pedestrians = new ArrayList<PhysicalObject>();
        for (int i = 0; i < 3; i++) {
            pedestrians.add(new Pedestrian());
        }
        for (int i = 3; i < 10; i++) {
            pedestrians.add(new Pedestrian(new Newspaper()));
        }
        var street = new Location(pedestrians);

        var cleaners = new Cleaner[] { new Car() };

        var ladder = new Door(new Rectangle(1, 3), new Position(5, 3.5f), street, new Position(0, 0));

        var room = new Room(new Rectangle(5, 4), cleaners);

        var travelers = new Travelers();

        room.getObjetcs().add(travelers);
        room.cleanRoom();

        travelers.interact();
        travelers.goOut(ladder, room);
        travelers.lookAround();

        for (var p : pedestrians) {
            p.interact();
        }
    }
}
