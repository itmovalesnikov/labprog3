package com.github.itmovalesnikov.labprog3.objs;

public class Newspaper {
    private String name = "unnamed_newspaper";

    public String read() {
        return "Текст из газеты";
    }

    @Override
    public String toString() {
        return name;
    }
}
