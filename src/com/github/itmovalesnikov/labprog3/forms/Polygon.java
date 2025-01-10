package com.github.itmovalesnikov.labprog3.forms;

public class Polygon {
    private Position[] vertices;

    public Polygon(Position[] vertices) {
        if (vertices.length < 3) {
            throw new RuntimeException("The polygon has less than 3 vertices");
        }
        this.vertices = vertices;
    }

    public Position[] getVertices() {
        return vertices;
    }

    public float getArea() {
        // Gauss area formula
        float result = 0;
        for (int i = 0; i < vertices.length; i += 1) {
            result += vertices[i].x() * vertices[(i + 1) % vertices.length].y();
            result -= vertices[(i + 1) % vertices.length].x() * vertices[i].y();
        }
        return 0.5f * Math.abs(result);
    }

    public float getPerimeter() {
        float result = 0;
        for (int i = 0; i < vertices.length; i += 1) {
            result += vertices[i].distance(vertices[(i + 1) % vertices.length]);
        }
        return result;
    }

    public Position getCenter() {
        float xSum = 0;
        float ySum = 0;
        for (Position vert : vertices) {
            xSum += vert.x();
            ySum += vert.y();
        }
        xSum /= vertices.length;
        ySum /= vertices.length;
        return new Position(xSum, ySum);
    }

}
