package com.github.itmovalesnikov.labprog3.locations;

public class NoLocationException extends TransitionException {
    public NoLocationException() {
        super("Location is missing or not realized");
    }
}
