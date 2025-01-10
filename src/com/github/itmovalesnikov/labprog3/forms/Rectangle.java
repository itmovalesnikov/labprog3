package com.github.itmovalesnikov.labprog3.forms;

public class Rectangle extends Polygon {

    public Rectangle(float width, float height) {
        this(new Position(-width / 2, -height / 2), width, height);
    }

    public Rectangle(Position pos, float width, float height) {
        super(new Position[] {
                pos,
                new Position(pos.x() + width, pos.y()),
                new Position(pos.x() + width, pos.y() + height),
                new Position(pos.x(), pos.y() + height),
        });
        if (width < 0 || height < 0) {
            throw new RuntimeException("Invalid rectangle width or height");
        }
    }

    public float getHeight() {
        return getVertices()[3].y() - getVertices()[0].y();
    }

    public float getWidth() {
        return getVertices()[1].x() - getVertices()[0].x();
    }
}
