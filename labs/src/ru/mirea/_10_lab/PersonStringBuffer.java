package ru.mirea._10_lab;

public class PersonStringBuffer
{
    private StringBuffer lastName;
    private StringBuffer firstName;
    private StringBuffer fatherName;

    public PersonStringBuffer(StringBuffer lastName, StringBuffer firstName, StringBuffer fatherName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = fatherName;
    }

    public PersonStringBuffer(StringBuffer lastName, StringBuffer firstName)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fatherName = new StringBuffer();
    }

    public PersonStringBuffer(StringBuffer lastName)
    {
        this.lastName = lastName;
        this.firstName = new StringBuffer();
        this.fatherName = new StringBuffer();
    }

    public StringBuffer getFIO()
    {
        StringBuffer name = new StringBuffer(this.lastName);

        if (this.firstName.length() != 0)
            name.append(" ").append(this.firstName.charAt(0)).append(".");

        if (this.fatherName.length() != 0)
            name.append(this.fatherName.charAt(0));

        return name;
    }
}
