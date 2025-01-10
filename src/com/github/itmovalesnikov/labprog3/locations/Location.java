package com.github.itmovalesnikov.labprog3.locations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.github.itmovalesnikov.labprog3.objs.PhysicalObject;

public class Location {
    private ArrayList<PhysicalObject> objects;

    protected String name = null;

    public Location() {
        objects = new ArrayList<PhysicalObject>();
    }

    public Location(Collection<PhysicalObject> objects) {
        this.objects = new ArrayList<PhysicalObject>(objects);
    }

    public List<PhysicalObject> getObjetcs() {
        return objects;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (name != null) {
            return name;
        } else {
            return "unnamed_location";
        }
    }
}
