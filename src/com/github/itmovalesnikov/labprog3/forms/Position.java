package com.github.itmovalesnikov.labprog3.forms;

public record Position(float x, float y) {

    public Position scale(float scale) {
        return new Position(x * scale, y * scale);
    }

    public Position differense(Position other) {
        return new Position(x - other.x(), y - other.y());
    }

    public float distance(Position other) {
        var d = differense(other);
        return (float) Math.sqrt(d.x() * d.x() + d.y() * d.y());
    }

    public Position add(Position other) {
        return new Position(x - other.x(), y - other.y());
    }
}
