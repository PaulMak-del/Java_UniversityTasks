package ru.mirea._13_lab;

class Complex
{
	public int real;
	public int image;

	public Complex()
	{
		this.real = 0;
		this.image = 0;
	}

	public Complex(int real, int image)
	{
		this.real = real;
		this.image = image;
	}

	public String toString()
	{
		return "real: " + this.real + "\nimage: " + this.image;
	}
}
