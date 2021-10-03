package ru.mirea._27_lab;

import java.util.*;

class Generics
{
	public static void main(String[] args)
	{
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
		String[] stringArray = {"One", "Two", "Free", "Four"};

		System.out.println(convertToList(intArray));
		System.out.println(convertToList(stringArray));
	}

	public static <E> ArrayList<E> convertToList(E[] array)
	{
		ArrayList<E> list = new ArrayList<>();

		for (int i = 0; i < array.length; i++)
		{
			list.add(array[i]);
		}

		return list; 
	}

}
