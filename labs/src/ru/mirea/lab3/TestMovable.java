package ru.mirea.lab3;

public class TestMovable {
    public static void main(String[] args) {
        Movable point = new MovablePoint(10, 10, 5, 5);
        System.out.println(point);
        point.moveUp();
        point.moveLeft();
        System.out.println(point);

        Movable circle = new MovableCircle(12, 7, 10, 10, 9);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println(circle);

        Movable rectangle = new MovableRectangle(-10, 10, 10, -10, 7, 7);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
