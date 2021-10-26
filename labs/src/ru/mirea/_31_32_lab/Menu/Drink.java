package ru.mirea._31_32_lab.Menu;

public class Drink extends MenuItem implements Alcoholable
{
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(double cost, DrinkTypeEnum type, String description)
    {
        super(cost, type.name(), description);
        this.type = type;
        switch (this.type)
        {
            case BEER -> this.alcoholVol = 5.00;
            case WINE -> this.alcoholVol = 13.00;
            case VODKA -> this.alcoholVol = 40.00;
            case BRANDY -> this.alcoholVol = 37.00;
            case CHAMPAGNE -> this.alcoholVol = 10.00;
            case WHISKEY -> this.alcoholVol = 45.00;
            case TEQUILA -> this.alcoholVol = 35.00;
            case RUM -> this.alcoholVol = 50.00;
            case VERMUTH -> this.alcoholVol = 18.00;
            case LIQUOR -> this.alcoholVol = 42.00;
            case JAGERMEISTER -> this.alcoholVol = 36.00;
            default -> this.alcoholVol = 0.00;
        };
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
        return this.alcoholVol;
    }
}
