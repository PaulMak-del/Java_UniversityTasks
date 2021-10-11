package ru.mirea._14_lab;

interface AbstractChairFactory
{
	public VictorianChair createVictorianChair();
	public MagicChair createMagicanChair();
	public FunctionalChair createFunctionalChair();
}
