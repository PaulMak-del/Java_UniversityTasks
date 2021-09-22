package ru.mirea._6_lab;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting
{
    public static void selectionSort(Comparable[] list)
    {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
            {
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void quickSort(Student[] array, int low, int high)
    {
        Comparator<Student> comp = new StudentGpaComparator();

        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (comp.compare(array[i], opora)  > 0) {
                i++;
            }

            while (comp.compare(array[j], opora) < 0) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void mergeSort(Student[] array, int begin, int end)
    {
        Comparator comp = new StudentGpaComparator().thenComparing(new StudentIDComparator());

        if (end <= begin)
            return;
        int mid = begin + (end - begin) / 2;
        mergeSort(array, begin, mid);
        mergeSort(array, mid + 1, end);

        Student[] buf = Arrays.copyOf(array, array.length);

        for (int k = begin; k <= end; k++)
            buf[k] = array[k];

        int i = begin, j = mid + 1;
        for (int k = begin; k <= end; k++) {

            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > end) {
                array[k] = buf[i];
                i++;
            } else if (comp.compare(buf[j], buf[i]) < 0) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }
}
