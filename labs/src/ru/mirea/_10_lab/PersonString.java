package ru.mirea._10_lab;

public class PersonString
{
    private String firstName;
    private String lastName;
    private String fatherName;

    public PersonString(String lastName, String firstName, String fatherName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
    }

    public PersonString(String lastName, String firstName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = "";
    }

    public PersonString(String lastName)
    {
        this.lastName = lastName;
        this.firstName = "";
        this.fatherName = "";
    }

    public String getFIO()
    {
        String name = this.lastName;

        if (!this.firstName.isEmpty())
            name += " " + this.firstName.charAt(0) + ".";

        if (!this.fatherName.isEmpty())
            name += this.fatherName.charAt(0) + ".";

        return name;
    }
}
