package Part_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		int count = 0;
		int number = 0;
		
		while (count < 5)
		{
			System.out.print("Please enter a number between 10 and 100(inclusive): ");
			number = input.nextInt();
			System.out.println();
			
			if (number < 10 || number > 100)
			{
				System.out.println("A number outside the parameters was entered and will not be stored.\n");
			}
			else 
			{
				if (!numberList.contains(number))
				{
					numberList.add(number);	
				}			
				
			}
			
			System.out.print("The numbers currently being stored are as follows: ");
			
			for(int nonDuplicateNumbers : numberList)
			{
				System.out.print(nonDuplicateNumbers + " ");
			}
			System.out.println();
			System.out.println("The current amount of numbers being stored(Array List Size) is: " + numberList.size() + "\n");
			count++;
		}
		
		input.close();
	}

}
