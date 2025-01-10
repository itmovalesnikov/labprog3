package com.github.itmovalesnikov.labprog3.locations;

import com.github.itmovalesnikov.labprog3.forms.Polygon;
import com.github.itmovalesnikov.labprog3.forms.Position;

public class Door extends LocationTransition {
    private boolean locked;

    public Door(Polygon form, Position position) {
        this(form, position, null, null);
    }

    public Door(Polygon form, Position position, Location nextLocation, Position nextLocationPos) {
        super(form, position, nextLocation, nextLocationPos);
        this.name = "unnamed_door";
    }

    public void lock() {
        locked = true;
    }

    public void unlock() {
        locked = false;
    }

    public Location getNextLocation() throws TransitionException {
        if (locked) {
            throw new DoorLockedException();
        }
        if (nextLocation == null) {
            throw new NoLocationException();
        } else {
            return nextLocation;
        }
    }

    public Position getNextLocationPos() throws TransitionException {
        if (locked) {
            throw new DoorLockedException();
        }
        if (nextLocationPos == null) {
            throw new NoLocationException();
        } else {
            return nextLocationPos;
        }
    }
}
