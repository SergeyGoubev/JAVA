package com.company;

public class Point implements Comparable {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + ";" + y;
    }

    @Override
    public int compareTo(Object t) {
        if (this.x != ((Point) t).x) {
            return this.x > ((Point) t).x ? 1 : -1;
        }
        return this.y > ((Point) t).y ? 1 : -1;
    }
}