package ru.mirea._31_32_lab;

public class Customer
{
    private String firstName;
    private String secondName;
    private int age;
    private Address address;
    private static final Customer MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 90, null);
    private static final Customer NOT_MATURE_UNKNOWN_CUSTOMER = new Customer(null, null, 0, null);

    public Customer(String firstName, String secondName, int age, Address address)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getSecondName()
    {
        return this.secondName;
    }

    public int getAge()
    {
        return this.age;
    }

    public Address getAddress()
    {
        return this.address;
    }

    public String toString()
    {
        return this.firstName + " " + this.secondName;
    }
}
