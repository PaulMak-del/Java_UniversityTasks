package ru.mirea._30_lab;

import java.util.Scanner;
import java.util.regex.Pattern;

class GoodPassword
{
	public static void main(String[] args)
	{
		while (true)
		{
			System.out.print("Enter a password for registration:");
			Scanner sc = new Scanner(System.in);
			String password = sc.nextLine();
			Pattern pattern = Pattern.compile("");

			if (password.length() >= 8 && Pattern.matches("\\w*(\\d+)\\w*", password) && 
						      Pattern.matches("\\w*([a-z]+)\\w*", password) && 
						      Pattern.matches("\\w*([A-Z]+)\\w*", password) &&
						      !Pattern.matches("\\W", password))
			{
				System.out.println("It's a perfect password!!");
				break;
			}

			System.out.println("Not good password");
		}
	}
}
