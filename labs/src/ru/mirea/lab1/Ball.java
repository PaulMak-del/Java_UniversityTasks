package ru.mirea.lab1;

public class Ball
{
    private String sportType;
    private int size;
    private boolean isPumpedUp;

    public Ball(String sportType, int ballSize, boolean isPumpedUp)
    {
        this.sportType = sportType;
        this.size = ballSize;
        this.isPumpedUp = isPumpedUp;
    }

    public Ball(String sportType, int ballSize)
    {
        this.sportType = sportType;
        this.size = ballSize;
        this.isPumpedUp = false;
    }

    public Ball(String sportType)
    {
        this.sportType = sportType;
        this.size = 0;
        this.isPumpedUp = false;
    }

    public Ball()
    {
        this.sportType = "'unknown'";
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public boolean isPumpedUp()
    {
        return isPumpedUp;
    }

    public String toString()
    {
        return "That ball for " + this.sportType + ", size: " + this.size;
    }
}
