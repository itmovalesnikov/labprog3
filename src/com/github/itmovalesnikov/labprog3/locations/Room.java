package com.github.itmovalesnikov.labprog3.locations;

import java.util.Collection;
import java.util.Collections;

import com.github.itmovalesnikov.labprog3.forms.Polygon;
import com.github.itmovalesnikov.labprog3.forms.Rectangle;
import com.github.itmovalesnikov.labprog3.objs.Cleaner;
import com.github.itmovalesnikov.labprog3.objs.PhysicalObject;

public class Room extends Location {
    private Cleaner[] cleaners;
    private Polygon form;

    public Room() {
        this(new Rectangle(0, 0), new Cleaner[] {});
    }

    public Room(Polygon form, Cleaner[] cleaners2) {
        this(form, cleaners2, Collections.emptyList());
    }

    public Room(Polygon form, Cleaner[] cleaners, Collection<PhysicalObject> objects) {
        super(objects);
        this.cleaners = cleaners;
        this.form = form;
    }

    public Polygon getForm() {
        return form;
    }

    public void cleanRoom() {
        for (var cleaner : cleaners) {
            cleaner.clean(this);
        }
    }
}
