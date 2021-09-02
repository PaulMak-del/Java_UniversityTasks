package ru.mirea.lab1;

public class TestBall {
    public static void main(String [] arg)
    {
        Ball ball_1 = new Ball("Football", 6, true);
        Ball ball_2 = new Ball("Basketball", 7);
        Ball ball_3 = new Ball("Volleyball");
        Ball ball_4 = new Ball();

        ball_4.setSize(4);
        ball_4.setSportType("Handball");

        if (ball_4.isPumpedUp())
        {
            System.out.println("Ball#4 is pumped up");
        }
        else {
            System.out.println("Ball#4 is not pumped up");
        }

        System.out.println(ball_1);
        System.out.println(ball_2);
        System.out.println(ball_4);

    }
}
