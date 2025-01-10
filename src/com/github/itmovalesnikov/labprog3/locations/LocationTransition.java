package com.github.itmovalesnikov.labprog3.locations;

import com.github.itmovalesnikov.labprog3.forms.Polygon;
import com.github.itmovalesnikov.labprog3.forms.Position;
import com.github.itmovalesnikov.labprog3.objs.PhysicalObject;

public class LocationTransition extends PhysicalObject {
    protected Location nextLocation;
    protected Position nextLocationPos;

    public LocationTransition(Polygon form, Position position) {
        this(form, position, null, null);
    }

    public LocationTransition(Polygon form, Position position, Location nextLocation, Position nextLocationPos) {
        super(form, position);
        this.nextLocation = nextLocation;
        this.nextLocationPos = nextLocationPos;
        this.name = "unnamed_location_transition";
    }

    @Override
    public void interact() {
    }

    public Location getNextLocation() throws TransitionException {
        if (nextLocation == null) {
            throw new NoLocationException();
        } else {
            return nextLocation;
        }
    }

    public Position getNextLocationPos() throws TransitionException {
        if (nextLocationPos == null) {
            throw new NoLocationException();
        } else {
            return nextLocationPos;
        }
    }
}
