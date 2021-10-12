package ru.mirea._26_lab.Task3;

import java.util.Scanner;

public class Exception3
{
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        int i = Integer.parseInt(intString);
        System.out.println( 10 / i );
    }
}
