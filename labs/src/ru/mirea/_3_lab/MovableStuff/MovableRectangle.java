package ru.mirea._3_lab.MovableStuff;

public class MovableRectangle extends Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString()
    {
        return "TopLeft " + topLeft.toString() + "\nBottomRight " + bottomRight.toString();
    }

    public boolean isSpeedCorrect()
    {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    @Override
    void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
