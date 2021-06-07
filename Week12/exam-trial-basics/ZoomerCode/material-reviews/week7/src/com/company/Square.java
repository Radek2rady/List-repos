package com.company;

public class Square implements Figure {

    private int sideSize;

    public Square(int sideSize) {
        this.sideSize = sideSize;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public double countArea() {
        return sideSize*sideSize;
    }
}
