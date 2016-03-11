package ru.levelp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Created by natalie on 11.03.16.
 */

public class Main {

    private static int count = 0;

    public static void main(String[] args) {

        // Наследование - возможность перенять одним классом св-ва другого (поля, методы)
        // Это помогает построить правильную иерархию и избежать повторения кода

        // Сколько угодно наследников, но только один родитель (!)
//
//        Rectangle r1 = new Rectangle(5, 7, "black");
//        System.out.println("S = " + r1.getS());
//        r1.setWidth(20);
//        System.out.println("S = " + r1.getS());
//
//        Triangle t1 = new Triangle(7, "red");
//        System.out.println("P = " + t1.getP());
//
//        // Полиморфизм
        /*
        Перегрузка методов:
        Создание метода с одним именем, но разными параметрами
        1) Количество параматеров
        2) Тип параметров

        Переопределение методов:
        Изменение родительского метода
         */

//        ArrayList<Rectangle> recList = new ArrayList<>(); // массив Rectangle
//        recList.add(new Rectangle(10, 30));
//
//        ArrayList<Triangle> triList = new ArrayList<>(); // массив Triangle
//        triList.add(new Triangle(10, "red"));
//
//        ArrayList<Figure2D> figures = new ArrayList<>(); // родительский массив может хранить всех наследников
//        figures.add(new Rectangle(5, 7));
//        figures.add(new Triangle(40, "blue"));
//
//        figures.get(0); // вернет тип "Figure2D"
//
//        // нельзя приравнять Triangle t = figures.get(0)
//
//        if (figures.get(0) instanceof Triangle) { // если является объектом класса?
//            Triangle t = (Triangle) figures.get(0);
//        }

        /* ГРАФИЧЕСКИЕ ИНТЕРФЕЙСЫ

        Самая первая, стандартная библиотека AVT - сложная, но гибкая
        Java FX - верстка, xml

        будем использовать swing
        для больших проектов она недостаточно гибкая
        все компоненты начинаются с J

        */

        JFrame mainFrame = new JFrame("First app"); // первое окошко
        mainFrame.setBounds(100, 100, 300, 200);
        /*
        размеры в пикселях
        x,y - отступы для левого верхнего угла
        + ширина, высота
          */
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // программа закроется, когда закрыто ЭТО окно

//        JButton button = new JButton("Push me"); // создаем кнопку
//
//        // обработчик события - любых действий в GUI - объект с методом ActionPerformed
//
//            button.addActionListener(new ActionListener() { // этот метод будет вызываться при каждом клике ЛКМ
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    count++;
//                    button.setText(String.valueOf(count));
//                }
//            });

    //    button.addActionListener(e -> System.out.println("And then just touch me")); Java8 - ЛЯМБДА

        // диспетчер компонентов - набор правил расположения компонентов в окне
        // BorderLayout - диспетчер для JFrame, по умолчанию содержит максимум 5 компонентов

        JButton northBtn = new JButton("North");
        JButton southBtn = new JButton("South");
        JButton eastBtn = new JButton("East");
        JButton westBtn = new JButton("West");
        JButton centerBtn = new JButton("Center");

        mainFrame.add(BorderLayout.NORTH, northBtn); // занимает всю ширину окна, высота по контенту
        mainFrame.add(BorderLayout.SOUTH, southBtn); // занимает всю ширину окна, высота по контенту
        mainFrame.add(BorderLayout.EAST, eastBtn); // занимает всю оставшуюся высоту, ширина по контенту
        mainFrame.add(BorderLayout.WEST, westBtn); // занимает всю оставшуюся высоту, ширина по контенту
        mainFrame.add(BorderLayout.CENTER, centerBtn); // занимает все, что осталось


//        mainFrame.add(button); // добавляем в окно кнопку
        // (!) за размер компонента в окне отвечает окно, а не компонент
        // т.к. при изменении размера окна все должно меняться соответствующим образом


        mainFrame.setVisible(true); // становится видимым после сборки всех компонентов окна!








    }
}
