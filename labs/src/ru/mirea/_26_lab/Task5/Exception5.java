package ru.mirea._26_lab.Task5;

public class Exception5
{
    public void printMessage(String key) {
        try
        {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e)
        {
            System.out.println("null key in getDetails");
        }
    }

    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }

        return "data for " + key;
    }

}
