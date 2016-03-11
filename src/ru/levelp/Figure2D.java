package ru.levelp;

/**
 * Created by natalie on 11.03.16.
 */
public class Figure2D {

    // private НЕ наследуется
    // protected = private, но с возможностью наследования

    protected double S;
    protected double P; // для круга - длина окружности
    protected String color;

    public double getS() {
        return S;
    }

    public double getP() {
        return P;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected void calculate() { // оставляем метод пустым, но задаем, что он должен быть во всех классах

    }
}

