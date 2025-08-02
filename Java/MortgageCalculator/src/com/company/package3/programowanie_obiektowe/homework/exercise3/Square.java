package com.company.package3.programowanie_obiektowe.homework.exercise3;

public class Square {
    private int side;

    public Square() {
        this.side = 5;
    }

    public Square(final int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(final int side) {
        this.side = side;
    }


    public int pole() { return side * side; }
    public int obwod() {return 4 * side;}

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Square square = (Square) o;
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
