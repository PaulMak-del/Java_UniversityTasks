package ru.mirea._10_lab;

public class PersonTest
{
    public static void main(String[] args)
    {
        long startTime, elapsedTime;

        PersonString personString_1 = new PersonString("Хоменко", "Павел", "Сергеевич");
        PersonString personString_2 = new PersonString("Ivanov", "Ivan");
        PersonString personString_3 = new PersonString("Petrov");

        startTime = System.nanoTime();

        System.out.println(personString_1.getFIO());
        System.out.println(personString_2.getFIO());
        System.out.println(personString_3.getFIO());

        elapsedTime = System.nanoTime() - startTime;
        System.out.println("With String: " + (elapsedTime / 1000) + "\n");



        PersonStringBuffer personStringBuffer_1 = new PersonStringBuffer(new StringBuffer("Хоменко"), new StringBuffer("Павел"), new StringBuffer("Сергеевич"));
        PersonStringBuffer personStringBuffer_2 = new PersonStringBuffer(new StringBuffer("Ivanov"), new StringBuffer("Ivan"));
        PersonStringBuffer personStringBuffer_3 = new PersonStringBuffer(new StringBuffer("Petrov"));

        startTime = System.nanoTime();

        System.out.println(personStringBuffer_1.getFIO());
        System.out.println(personStringBuffer_2.getFIO());
        System.out.println(personStringBuffer_3.getFIO());

        elapsedTime = System.nanoTime() - startTime;
        System.out.println("With StringBuffer: " + elapsedTime / 1000 + "\n");



        PersonStringBuilder personStringBuilder = new PersonStringBuilder(new StringBuilder("Хоменко"), new StringBuilder("Павел"), new StringBuilder("Сергеевич"));
        PersonStringBuilder personStringBuilder1 = new PersonStringBuilder(new StringBuilder("Ivanov"), new StringBuilder("Ivan"));
        PersonStringBuilder personStringBuilder2 = new PersonStringBuilder(new StringBuilder("Petrov"));

        startTime = System.nanoTime();

        System.out.println(personStringBuilder.getFIO());
        System.out.println(personStringBuilder1.getFIO());
        System.out.println(personStringBuilder2.getFIO());

        elapsedTime = System.nanoTime() - startTime;
        System.out.println("With StringBuilder: " + elapsedTime / 1000 + "\n");
    }
}
