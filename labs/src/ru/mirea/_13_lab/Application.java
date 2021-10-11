package ru.mirea._13_lab;

class Application
{
	public static void main(String[] args)
	{
		ComplexAbstractFactory num;
		num = new ConcreteFactory();
		num.createComplex(12, 13);

		System.out.println(num);	
	}
}
