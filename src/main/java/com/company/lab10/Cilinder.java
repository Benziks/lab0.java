package com.company.lab10;

public class Cilinder extends Circle {

    private int h;
    private double S;
    private double V;

    public Cilinder(int r, int h) {
        super(r);
        this.setH(h);
        this.setV(V);
        this.setS();
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h >= 1) {
            this.h = h;
        } else {
            this.h = 1;
        }
    }

    public double getS() {
        return (2 * super.getS()) + (2 * pi * this.getR() * this.getH());
    }

    public void setS(double s) {
        this.S = getS();
    }

    public double getV() {
        return super.getS() * this.getH();
    }

    public void setV(double v) {
        this.V = getV();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", h= " + this.getH() +
                ", V= " + this.getV();
    }
}
