package ru.mirea._13_lab;

class ConcreteFactory implements ComplexAbstractFactory
{
	private Complex num;

	@Override
	public Complex createComplex()
	{
		this.num = new Complex();
		return num;
	}

	@Override
	public Complex createComplex(int real, int image)
	{
		this.num = new Complex(real, image);
		return num;
	}

	public String toString()
	{
		return "real: " + num.real + "\nimage: " + num.image;
	}
}
