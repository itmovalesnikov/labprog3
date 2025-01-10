package com.github.itmovalesnikov.labprog3.forms;

public class Circle extends Polygon {

    public Circle(float radius) {
        this(new Position(0, 0), radius);
    }

    public Circle(Position pos, float radius) {
        this(pos, radius, 12);
    }

    public Circle(Position pos, float radius, int precision) {
        super(calcPositions(pos, radius, precision));
        if (radius < 0) {
            throw new RuntimeException("Invalid circle radius: " + radius);
        }
    }

    public float getRadius() {
        return getVertices()[0].x();
    }

    private static Position[] calcPositions(Position pos, float radius, int precision) {
        var verts = new Position[precision];
        for (int i = 0; i < precision; i += 1) {
            var y = radius * (float) Math.sin(2 * Math.PI * ((float) i / precision));
            var x = radius * (float) Math.cos(2 * Math.PI * ((float) i / precision));
            verts[i] = new Position(x, y).add(pos);
        }
        return verts;
    }
}
