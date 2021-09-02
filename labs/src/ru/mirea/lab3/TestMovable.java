package ru.mirea.lab3;

public class TestMovable {
    public static void main(String[] args) {
        Movable circle = new MovableCircle(0, 0, 5, 10, 9);

        System.out.println(circle);

        circle.moveRight();
        circle.moveUp();

        System.out.println(circle);

        circle.moveUp();
        circle.moveRight();

        System.out.println(circle);
    }
}
