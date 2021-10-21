import java.io.IOException;
import java.util.Arrays;

public class Draft
{
    public static void main(String[] args) throws IOException
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] array_copy = new int[10];
        System.arraycopy(array, 5, array_copy, 3, 5);

        System.out.println(Arrays.toString(array_copy));
    }
}