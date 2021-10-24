package ru.mirea._31_32_lab;

import ru.mirea._31_32_lab.Menu.*;
import ru.mirea._31_32_lab.Exceptions.IllegalTableNumberException;
import ru.mirea._31_32_lab.Exceptions.OrderAlreadyAddedException;

public class Application
{
    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumberException
    {

    }

    public static void init()
    {
        //Dishes
        MenuItem pizza = new Dish(10.99, DishTypeEnum.PIZZA.name(), "Pizza is an Italian dish consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients (such as anchovies, mushrooms, onions, olives, pineapple, meat, etc.), which is then baked at a high temperature, traditionally in a wood-fired oven.");
        MenuItem hot_dog = new Dish(21.50, DishTypeEnum.HOTDOG.name(), "Some description");
        MenuItem rise = new Dish(13.40, DishTypeEnum.RISE.name(), "Some description");
        MenuItem hamburger = new Dish(24.15, DishTypeEnum.HAMBURGER.name(), "Some description");
        MenuItem sandwich = new Dish(15.69, DishTypeEnum.SANDWICH.name(), "Some description");
        MenuItem steak = new Dish(16.20, DishTypeEnum.STEAK.name(), "Some description");

        //Drinks
        MenuItem beer = new Drink(10.00, DrinkTypeEnum.BEER.name(), "Some description");
        MenuItem wine = new Drink(10.00, DrinkTypeEnum.WINE.name(), "Some description");
        MenuItem vodka = new Drink(10.00, DrinkTypeEnum.VODKA.name(), "Some description");
        MenuItem brandy = new Drink(10.00, DrinkTypeEnum.BRANDY.name(), "Some description");
        MenuItem rum = new Drink(10.00, DrinkTypeEnum.RUM.name(), "Some description");
        MenuItem milk = new Drink(10.00, DrinkTypeEnum.MILK.name(), "Some description");
        MenuItem water = new Drink(10.00, DrinkTypeEnum.WATER.name(), "Some description");

        //Addresses
        Address address_1 = new Address("Moscow", 131353, "Улица Охотный ряд", 1, 'А', 122);
        Address address_2 = new Address("Moscow", 101000, "Улица Никольская", 2, 'Б', 54);
        Address address_3 = new Address("Moscow", 103274, "Камергерский переулок", 3, 'В', 152);
        Address address_4 = new Address("Moscow", 105005, "Улица Моховая", 4, 'Г', 103);
        Address address_5 = new Address("Moscow", 105064, "Столешников переулок", 5, 'Д', 62);

        //Customers
        Customer customer_1 = new Customer("Борис", "Ерохин", 34, address_1);
        Customer customer_2 = new Customer("Вадим", "Петров", 21, address_2);
        Customer customer_3 = new Customer("Олег", "Иванов", 17, address_3);
        Customer customer_4 = new Customer("Никита", "Смирнов", 56, address_4);
        Customer customer_5 = new Customer("Валерий", "Кириллов", 11, address_5);
    }
}
