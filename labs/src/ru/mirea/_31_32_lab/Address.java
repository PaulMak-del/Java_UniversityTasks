package ru.mirea._31_32_lab;

public class Address
{
    private String cityName;
    private int zipCode;
    private String streetName;
    private int buildingNumber;
    private int apartmentNumber;
    public static final Address EMPTY_ADDRESS = new Address(null, 0, null, 0, 0);

    public Address(String cityName, int zipCode, String streetName, int buildingNumber, int apartmentNumber)
    {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
    }

    public String getCityName()
    {
        return this.cityName;
    }

    public int getZipCode()
    {
        return this.zipCode;
    }

    public String getStreetName()
    {
        return this.streetName;
    }

    public int getBuildingNumber()
    {
        return this.buildingNumber;
    }

    public int getApartmentNumber()
    {
        return this.apartmentNumber;
    }

    public String toString()
    {
        return "гор." + this.cityName + " " + this.zipCode + " ул." + this.streetName +  " д." + this.buildingNumber +
                " кв." + this.apartmentNumber;
    }
}
