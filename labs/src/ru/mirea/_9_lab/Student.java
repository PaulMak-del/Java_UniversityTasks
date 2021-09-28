package ru.mirea._9_lab;

public class Student implements Comparable<Student>
{
    private int iDNumber;
    private String name;
    private float gpa;

    public Student(int iDNumber, String name, float gpa)
    {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDNumber()
    {
        return this.iDNumber;
    }

    public double getGpa()
    {
        return this.gpa;
    }

    public String getName()
    {
        return this.name;
    }

    public String toString()
    {
        return this.iDNumber + ")" + this.name + ": " + this.gpa;
    }

    @Override
    public int compareTo(Student student)
    {
        return this.iDNumber - student.iDNumber;
    }
}
