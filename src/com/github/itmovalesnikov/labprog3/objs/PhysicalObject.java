package com.github.itmovalesnikov.labprog3.objs;

import com.github.itmovalesnikov.labprog3.forms.Polygon;
import com.github.itmovalesnikov.labprog3.forms.Position;
import com.github.itmovalesnikov.labprog3.forms.Rectangle;

public abstract class PhysicalObject {
    private Polygon form = new Rectangle(new Position(-0.5f, -0.5f), 0.5f, 0.5f);
    private Position position = new Position(0, 0);
    protected String name = "unnamed_physical_object";

    public PhysicalObject() {
    }

    public PhysicalObject(Polygon form, Position pos) {
        this.form = form;
        this.position = pos;
    }

    public abstract void interact();

    public Polygon getForm() {
        return form;
    }

    public Position getPosition() {
        return position;
    }

    public void move(Position pos) {
        this.position = pos;
    }

    @Override
    public String toString() {
        return name;
    }
}
