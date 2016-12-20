package Part_2;

import java.util.Scanner;

public class Driver_ {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 

		boolean[] airPlaneSeats = new boolean[10];
		
		int whichClass = 0, firstClass = 0, economyClass = 5, seatsOnPlane = 0, changeClass = 0;
	
		while (seatsOnPlane < 10)
		{
			System.out.print("Please press 1 for First Class or 2 for Economy Class: ");
			whichClass = input.nextInt();
			
			if (whichClass == 1 && firstClass == 5)
			{
				System.out.print("We are sorry, but first class is fully booked.\n");
				System.out.print("Press 2 to be placed into Economy Class or 3 to wait for the next flight: ");
				changeClass = input.nextInt();
				
				if (changeClass == 2)
				{
					System.out.print("Your Economy Class seat number is: " + (economyClass + 1) + "\n");
					airPlaneSeats[economyClass++] = true; 
					seatsOnPlane++;
				}
				if (changeClass == 3)
				{
					System.out.print("We apologize but all seats are booked. The next flight leaves in 3 hours.\n");
				}
				
			}
			if (whichClass == 1 && firstClass != 5)
			{
				System.out.print("Your First Class seat number is: " + (firstClass + 1) + "\n");
				airPlaneSeats[firstClass++] = true; 
				seatsOnPlane++;
			}
			if (whichClass == 2 && economyClass == 10)
			{
				System.out.print("We are sorry, but economy class is fully booked.\n");
				System.out.print("Press 1 to be placed into First Class or 3 to wait for the next flight: ");
				changeClass = input.nextInt();
				
				if (changeClass == 1)
				{
					System.out.print("Your First Class seat number is: " + (firstClass + 1) + "\n");
					airPlaneSeats[firstClass++] = true; 
					seatsOnPlane++;
				}
				if (changeClass == 3)
				{
					System.out.print("We apologize but all seats are booked. The next flight leaves in 3 hours.\n");
				}
				
			}
			if (whichClass == 2 && economyClass != 10)
			{
				System.out.print("Your Economy Class seat number is: " + (economyClass + 1) + "\n");
				airPlaneSeats[economyClass++] = true; 
				seatsOnPlane++;
			}
		}
		System.out.print("We apologize but all seats are booked. The next flight leaves in 3 hours.");
		input.close();
	}

}
