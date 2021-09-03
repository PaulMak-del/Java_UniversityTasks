package ru.mirea.lab3;

public class MovableCircle extends Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "center in " + center.toString();
    }

    @Override
    void moveUp() {
        this.center.moveUp();
    }

    @Override
    void moveDown() {
        this.center.moveDown();
    }

    @Override
    void moveLeft() {
        this.center.moveLeft();
    }

    @Override
    void moveRight() {
        this.center.moveRight();
    }
}
