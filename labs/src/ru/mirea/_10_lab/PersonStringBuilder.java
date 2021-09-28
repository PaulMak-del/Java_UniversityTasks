package ru.mirea._10_lab;

public class PersonStringBuilder
{
    private StringBuilder lastName;
    private StringBuilder firstName;
    private StringBuilder fatherName;

    public PersonStringBuilder(StringBuilder lastName, StringBuilder firstName, StringBuilder fatherName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
    }

    public PersonStringBuilder(StringBuilder lastName, StringBuilder firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = new StringBuilder();
    }

    public PersonStringBuilder(StringBuilder lastName)
    {
        this.lastName = lastName;
        this.firstName = new StringBuilder();
        this.fatherName = new StringBuilder();
    }

    public StringBuilder getFIO()
    {
        StringBuilder name = new StringBuilder(this.lastName);

        if (this.firstName.length() != 0)
            name.append(" ").append(this.firstName.charAt(0)).append(".");

        if (this.fatherName.length() != 0)
            name.append(this.fatherName.charAt(0));

        return name;
    }
}
