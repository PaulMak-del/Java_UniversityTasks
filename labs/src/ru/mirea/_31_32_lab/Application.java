package ru.mirea._31_32_lab;

import ru.mirea._31_32_lab.Menu.*;
import ru.mirea._31_32_lab.Exceptions.IllegalTableNumberException;
import ru.mirea._31_32_lab.Exceptions.OrderAlreadyAddedException;
import ru.mirea._31_32_lab.Orders.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Application
{
    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumberException
    {
        //Dishes
        MenuItem pizza = new Dish(10.99, DishTypeEnum.PIZZA.name(), "Some description");
        MenuItem hot_dog = new Dish(21.50, DishTypeEnum.HOTDOG.name(), "Some description");
        MenuItem rise = new Dish(13.40, DishTypeEnum.RISE.name(), "Some description");
        MenuItem hamburger = new Dish(24.15, DishTypeEnum.HAMBURGER.name(), "Some description");
        MenuItem sandwich = new Dish(15.69, DishTypeEnum.SANDWICH.name(), "Some description");
        MenuItem steak = new Dish(16.20, DishTypeEnum.STEAK.name(), "Some description");

        //Drinks
        MenuItem beer = new Drink(10.00, DrinkTypeEnum.BEER, "Some description");
        MenuItem wine = new Drink(20.00, DrinkTypeEnum.WINE, "Some description");
        MenuItem vodka = new Drink(15.00, DrinkTypeEnum.VODKA, "Some description");
        MenuItem brandy = new Drink(14.00, DrinkTypeEnum.BRANDY, "Some description");
        MenuItem rum = new Drink(12.00, DrinkTypeEnum.RUM, "Some description");
        MenuItem milk = new Drink(11.00, DrinkTypeEnum.MILK, "Some description");
        MenuItem water = new Drink(5.00, DrinkTypeEnum.WATER, "Some description");

        //Addresses
        Address address_1 = new Address("Москва", 131353, "Улица Охотный ряд", 1, 122);
        Address address_2 = new Address("Москва", 101000, "Улица Никольская", 2, 54);
        Address address_3 = new Address("Москва", 103274, "Камергерский переулок", 3, 152);
        Address address_4 = new Address("Москва", 105005, "Улица Моховая", 4, 103);

        //Customers
        Customer customer_1 = new Customer("Борис", "Ерохин", 34, address_1);
        Customer customer_2 = new Customer("Вадим", "Петров", 21, address_2);
        Customer customer_3 = new Customer("Олег", "Иванов", 17, address_3);
        Customer customer_4 = new Customer("Никита", "Смирнов", 56, address_4);

        //Orders
        Order tableOrder_1 = new TableOrder();
        Order tableOrder_2 = new TableOrder();
        Order internetOrder_1 = new InternetOrder();
        Order internetOrder_2 = new InternetOrder();

        //Add menu items in orders
        tableOrder_1.add(pizza);
        tableOrder_1.add(beer);
        tableOrder_2.add(hot_dog);
        tableOrder_2.add(milk);
        internetOrder_1.add(steak);
        internetOrder_1.add(rum);
        internetOrder_2.add(rise);
        internetOrder_2.add(wine);

        //Add customers to orders
        tableOrder_1.setCustomer(customer_1);
        tableOrder_2.setCustomer(customer_2);
        internetOrder_1.setCustomer(customer_3);
        internetOrder_2.setCustomer(customer_4);

        //Create order managers and add orders to them
        TableOrderManager tableOrderManager = new TableOrderManager();
        InternetOrderManager internetOrderManager = new InternetOrderManager();
        tableOrderManager.add(tableOrder_1, 1);
        tableOrderManager.add(tableOrder_2, 3);
        internetOrderManager.add(address_3, internetOrder_1);
        internetOrderManager.add(address_4, internetOrder_2);

        ////Check the correct work
        //Output the customers
        System.out.println("Заказ " + Arrays.toString(tableOrder_1.getItems()) + " принадлежит " + tableOrder_1.getCustomer());
        System.out.println("Заказ " + Arrays.toString(tableOrder_2.getItems()) + " принадлежит " + tableOrder_2.getCustomer());
        System.out.println("Заказ " + Arrays.toString(internetOrder_1.getItems()) + " принадлежит " + internetOrder_1.getCustomer());
        System.out.println("Заказ " + Arrays.toString(internetOrder_2.getItems()) + " принадлежит " + internetOrder_2.getCustomer());
        System.out.println();

        //Output the summary cost
        System.out.println("Общая сумма заказов в ресторане " + tableOrderManager.ordersCostSummary() + " USD");
        System.out.println("Общая сумма заказов через интернет " + internetOrderManager.ordersCostSummary() + " USD");
        System.out.println();

        //Output the addresses
        System.out.println("Клиент " + customer_3 + " ожидает заказ по адресу " + customer_3.getAddress());
        System.out.println("Клиент " + customer_4 + " ожидает заказ по адресу " + customer_4.getAddress());
        System.out.println();

        //Add drinks
        Drink drink = new Drink(12.50, DrinkTypeEnum.JAGERMEISTER, "Some description");
        if (drink.isAlcoholicDrink())
        {
            if (tableOrder_1.getCustomer().getAge() > 17)
                tableOrder_1.add(drink);
            System.out.println("Алкогольный напиток добавлен");
        }
        else
            System.out.println("А ты не слишком мал для такого?");
        System.out.println();

        //Add new order to free table
        int freeTable = tableOrderManager.freeTableNumber();
        TableOrder newOrder = new TableOrder();
        newOrder.add(hamburger);
        newOrder.add(sandwich);
        newOrder.add(water);
        newOrder.add(vodka);
        tableOrderManager.add(newOrder, freeTable);
        System.out.println("Новый заказ " + tableOrderManager.getOrder(freeTable) + " к столику №" + freeTable);
        System.out.println("Сортировка по цене: " + Arrays.toString(tableOrderManager.getOrder(freeTable).sortedItemsByCostDesc()));
        System.out.println();

        //Chek the free tables
        System.out.println("Свободные столики: " + Arrays.toString(tableOrderManager.freeTableNumbers()));
    }
}














