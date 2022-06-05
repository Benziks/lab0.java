package com.company.lab10;

public class Circle {

    final double pi = Math.PI;
    protected int r;
    protected double S;
    protected double L;

    public Circle(int r) {
        this.setR(r);
        this.setL(L);
        this.setS();
    }

    public void setS() {
        this.S = getS();
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        if (r >= 1) {
            this.r = r;
        } else {
            this.r = 1;
        }
    }

    public double getS() {

        return pi * (r * r);
    }

    public double getL() {
        return 2 * pi * r;
    }

    public void setL(double l) {
        this.L = getL();
    }

    @Override
    public String toString() {

        return " R= " + this.getR() +
                ", S=" + this.getS() +
                ", l= " + this.getL() +
                '}';
    }
}
