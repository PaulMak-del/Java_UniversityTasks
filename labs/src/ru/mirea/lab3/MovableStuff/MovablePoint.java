package ru.mirea.lab3.MovableStuff;

public class MovablePoint extends Movable
{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "point ( " + this.x + ", " + this.y + " )";
    }

    @Override
    void moveUp() {
        this.y += ySpeed;
    }

    @Override
    void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    void moveRight() {
        this.x += xSpeed;
    }
}
