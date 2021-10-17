package ru.mirea._29_lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Money
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Pattern pattern = Pattern.compile("(\\d+)\\.\\d\\d\\s(USD|RUB|EU)");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find())
		{
			System.out.println(matcher.group());
		}
	}
}
