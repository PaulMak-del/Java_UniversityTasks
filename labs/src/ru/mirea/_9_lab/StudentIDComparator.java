package ru.mirea._9_lab;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2)
    {
        return o1.getiDNumber() - o2.getiDNumber();
    }
}
