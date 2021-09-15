package ru.mirea.lab20;

public class DishTest
{
    public static void main(String[] args)
    {
        Cup cup = new Cup();
        Plate plate_1 = new Plate();
        Plate plate_2 = new Plate("pasta");
        Pan pan = new Pan();

        System.out.println(cup);
        System.out.println(plate_1);
        System.out.println(plate_2);
        System.out.println(pan);

        cup.pourTea();
        cup.drinkTea();
        System.out.println(cup.isClear());

        plate_1.put("bread");
        plate_2.eat();
        System.out.println(plate_1);
        System.out.println(plate_2);

        pan.cook();
        System.out.println(pan.isClear());
    }
}
