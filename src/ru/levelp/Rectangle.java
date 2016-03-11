package ru.levelp;

/**
 * Created by natalie on 11.03.16.
 */

public class Rectangle extends Figure2D {

    private double width;
    private double height;

    // this - ссылка на объект, в метод которого мы зашли
    // объект.метод - java заходит в метод класса
    // this.метод - метод текущего класса


    public Rectangle(double width, double height, String color) {

        this.width = width;
        this.height = height;
        this.color = color;
        calculate();
    } // конструктор - тоже метод, вызывается в момент создания объекта

    public Rectangle(double width, String color) {

        this.width = width;
        height = width;
        this.color = color;
        calculate();
    } // можно создать несколько конструкторов, но с разными аргументами

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        color = "black"; // установим цвет по умолчанию
    }

    public void setWidth(double width) {
        this.width = width;
        calculate();
    }

    public void setHeigth(double heigth) {
        this.height = heigth;
        calculate();
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return height;
    }

    // переопределение родительского метода (при наследовании)
    protected void calculate() { // можем раскрыть права еще больше -> public, но закрыть не имеем права
        S = width * height;
        P = 2 * (width + height);
    }

    // авто get/set = ctrl+enter
}
