package ru.mirea._31_32_lab.Menu;

public class Drink extends MenuItem implements Alcoholable
{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(double cost, DrinkTypeEnum type, String description)
    {
        super(cost, type.name(), description);
        this.type = type;
    }

    public DrinkTypeEnum getType()
    {
        return this.type;
    }

    @Override
    public boolean isAlcoholicDrink()
    {
        return !this.type.equals(DrinkTypeEnum.JUICE) && !this.type.equals(DrinkTypeEnum.COFFEE) &&
                !this.type.equals(DrinkTypeEnum.GREEN_TEA) && !this.type.equals(DrinkTypeEnum.BLACK_TEA) &&
                !this.type.equals(DrinkTypeEnum.MILK) && !this.type.equals(DrinkTypeEnum.WATER) && !this.type.equals(DrinkTypeEnum.SODA);
    }

    @Override
    public double getAlcoholVol()
    {
        return switch (this.type)
                {
                    case BEER -> 5.00;
                    case WINE -> 13.00;
                    case VODKA -> 40.00;
                    case BRANDY -> 37.00;
                    case CHAMPAGNE -> 10.00;
                    case WHISKEY -> 45.00;
                    case TEQUILA -> 35.00;
                    case RUM -> 50.00;
                    case VERMUTH -> 18.00;
                    case LIQUOR -> 42.00;
                    case JAGERMEISTER -> 36.00;
                    default -> 0.00;
                };
    }
}
