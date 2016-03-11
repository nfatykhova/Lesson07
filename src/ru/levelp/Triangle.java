package ru.levelp;

/**
 * Created by natalie on 11.03.16.
 */
public class Triangle extends Figure2D {

    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        calculate();
    }

    public Triangle(double a, String color) {
        this.a = a;
        b = a;
        c = a;
        this.color = color;
        calculate();
    }

    public void setA(double a) {
        this.a = a;
        calculate();
    }

    public void setB(double b) {
        this.b = b;
        calculate();
    }

    public void setC(double c) {
        this.c = c;
        calculate();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    protected void calculate() {
        P = a + b + c;
        double p = P / 2;
        S = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона для S треугольника
    }
}
