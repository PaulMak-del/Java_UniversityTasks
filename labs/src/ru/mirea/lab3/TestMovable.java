package ru.mirea.lab3;

public class TestMovable {
    public static void main(String[] args) {
        Movable rectangle = new MovableRectangle(-10, 10, 10, -10, 5, 5);

        System.out.println(rectangle);

        rectangle.moveUp();

        System.out.println(rectangle);
    }
}
