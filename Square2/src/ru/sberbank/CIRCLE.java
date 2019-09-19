package ru.sberbank;

import java.math.*;

public class CIRCLE {
    private int r;

    public CIRCLE(int r) {
        this.r = r;

    }
    public void go() {
        System.out.println(Math.PI*r*r);
    }
}
