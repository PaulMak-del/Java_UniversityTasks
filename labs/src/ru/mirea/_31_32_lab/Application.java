package ru.mirea._31_32_lab;

import ru.mirea._31_32_lab.Enums.DishTypeEnum;
import ru.mirea._31_32_lab.Enums.DrinkTypeEnum;
import ru.mirea._31_32_lab.Exceptions.IllegalTableNumberException;
import ru.mirea._31_32_lab.Exceptions.OrderAlreadyAddedException;
import ru.mirea._31_32_lab.Menu.Dish;
import ru.mirea._31_32_lab.Menu.Drink;
import ru.mirea._31_32_lab.Menu.MenuItem;
import ru.mirea._31_32_lab.Orders.InternetOrder;
import ru.mirea._31_32_lab.Orders.Order;
import ru.mirea._31_32_lab.Orders.InternetOrderManager;
import ru.mirea._31_32_lab.Orders.RestaurantOrder;

public class Application
{
    public static void main(String[] args) throws OrderAlreadyAddedException, IllegalTableNumberException
    {
        MenuItem pizza = new Dish(10.99, DishTypeEnum.PIZZA.name(), "Pizza is an Italian dish consisting of a usually round, flattened base of leavened wheat-based dough topped with tomatoes, cheese, and often various other ingredients (such as anchovies, mushrooms, onions, olives, pineapple, meat, etc.), which is then baked at a high temperature, traditionally in a wood-fired oven.");
        MenuItem hot_dog = new Dish(21.50, DishTypeEnum.HOTDOG.name(), "Some description");
        MenuItem rise = new Dish(13.40, DishTypeEnum.RISE.name(), "Some description");
        MenuItem hamburger = new Dish(24.15, DishTypeEnum.HAMBURGER.name(), "Some description");
        MenuItem sandwich = new Dish(15.69, DishTypeEnum.SANDWICH.name(), "Some description");
        MenuItem steak = new Dish(16.20, DishTypeEnum.STEAK.name(), "Some description");

        MenuItem beer = new Drink(1.50, DrinkTypeEnum.BEER.name(), "Some description");
        MenuItem wine = new Drink(2.25, DrinkTypeEnum.WINE.name(), "Some description");
        MenuItem tea = new Drink(3.00, DrinkTypeEnum.TEA.name(), "Some description");
        MenuItem soda = new Drink(2.75, DrinkTypeEnum.SODA.name(), "Some description");
        MenuItem coffee = new Drink(1.75, DrinkTypeEnum.COFFEE.name(), "Some description");
        MenuItem brandy = new Drink(6.20, DrinkTypeEnum.BRANDY.name(), "Some description");

        Order internetOrder = new InternetOrder();
        Order restaurantOrder_1 = new RestaurantOrder();
        Order restaurantOrder_2 = new RestaurantOrder();
        InternetOrderManager orderManager = new InternetOrderManager();

//        internetOrder.add(pizza);
//        internetOrder.add(hamburger);
//        internetOrder.add(beer);
//        internetOrder.add(soda);
//        String address = "Some_address";
//        orderManager.add(address, internetOrder);
//
//        restaurantOrder_1.add(hot_dog);
//        restaurantOrder_1.add(sandwich);
//        restaurantOrder_1.add(wine);
//        restaurantOrder_1.add(coffee);
//        int freeTable = 4;
//        orderManager.add(restaurantOrder_1, freeTable);
//        orderManager.addItem(wine, freeTable);
//
//        restaurantOrder_2.add(rise);
//        restaurantOrder_2.add(steak);
//        restaurantOrder_2.add(tea);
//        restaurantOrder_2.add(brandy);
//        freeTable = 12;
//        orderManager.add(restaurantOrder_2, freeTable);
//
//        System.out.println("Заказ по адресу " + address + ": " + Arrays.toString(orderManager.getOrder(address).getItems()));
//        System.out.println("Общая сумма заказа: " + orderManager.getOrder(address).getTotalCost() + '\n');
//
//        System.out.println("Заказ столика №4: " + Arrays.toString(orderManager.getOrder(4).getItems()));
//        System.out.println("Общая сумма заказа: " + orderManager.getOrder(4).getTotalCost() + '\n');
//
//        System.out.println("Заказ столика №12: " + Arrays.toString(orderManager.getOrder(12).getItems()));
//        System.out.println("Общая сумма заказа: " + orderManager.getOrder(12).getTotalCost() + '\n');
//
//        System.out.println("Свободные столики: " + Arrays.toString(orderManager.freeTableNumbers()) + '\n');
//
//        orderManager.removeOrder(freeTable);
//        System.out.println("Столик 12 освободился");
//        restaurantOrder_2.remove(tea.getName());
//        restaurantOrder_2.remove(rise.getName());
//        restaurantOrder_2.add(beer);
//        restaurantOrder_2.add(pizza);
//        freeTable = orderManager.freeTableNumber();
//        orderManager.add(restaurantOrder_2, freeTable);
//
//        System.out.println("Заказ столика №" + freeTable + ": " + Arrays.toString(orderManager.getOrder(freeTable).getItems()));
//        System.out.println("Общая сумма заказа: " + orderManager.getOrder(freeTable).getTotalCost() + '\n');
//
//        System.out.println("Заказы в ресторане: " + Arrays.toString(orderManager.getRestaurantOrders()));
//        System.out.println("Стоимость всех заказанных блюд и напитков в ресторане: " + orderManager.restaurantOrdersCostSummary() + '\n');
//
//        System.out.println("Заказы на дом: " + Arrays.toString(orderManager.getInternetOrders()));
//        System.out.println("Стоимость всех заказанных блюд и напитков на дом: " + orderManager.internetOrderCostSummary());

    }
}
