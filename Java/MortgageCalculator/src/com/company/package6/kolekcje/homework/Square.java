package com.company.package6.kolekcje.homework;

public class Square {

    private int side;

    public Square() {
        this.side = 5;
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return side == square.side;
    }

    @Override
    public int hashCode() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
