package com.github.itmovalesnikov.labprog3.locations;

public class DoorLockedException extends TransitionException {
    public DoorLockedException() {
        super("The door to be opened is locked");
    }
}
