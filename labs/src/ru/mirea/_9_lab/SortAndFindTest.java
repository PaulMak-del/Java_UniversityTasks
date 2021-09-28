package ru.mirea._9_lab;

public class SortAndFindTest
{
    public static void main(String[] args) throws StudentNotFoundException
    {
        Student[] students = {new Student(5, "Adam", 20),
                              new Student(4, "Eva", 10),
                              new Student(3, "God", 10),
                              new Student(2, "Lucifer", 20),
                              new Student(1, "Jesus", 20)   };

        System.out.println("Students: ");
        for (Student i : students)
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Students sorted by ID with selection sort: ");
        SortingAndFind.selectionSort(students);
        for (Student i : students)
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Students sorted by GPA with quick sort: ");
        StudentGpaComparator sgc = new StudentGpaComparator();
        SortingAndFind.quickSort(students, 0, students.length - 1);

        for (Student i : students)
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Students sorted by GPA and ID with merge sort: ");
        SortingAndFind.mergeSort(students, 0, students.length - 1);
        for (Student i : students)
        {
            System.out.println(i);
        }

        String st = "JeSuS";

        try
        {
            System.out.println(SortingAndFind.find(students, st));
        }
        catch (StudentNotFoundException e)
        {
            System.out.println("Student '" + st + "' didn't founded");
        }
    }
}
