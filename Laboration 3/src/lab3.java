import java.util.InputMismatchException;
import java.util.Scanner;
public class lab3 
{
	public static void main(String[] args) 
	{
		arrayHanteraren slump = new arrayHanteraren();
		Scanner kommandon = new Scanner(System.in);
		int kommand = 1;

		System.out.println("V�lkommen till Slumpatron version 0.6! \nV�lj bland f�ljande alternativ!");
		while(kommand != 0)
		{
			slump.msg(3, 0, 0, 0, 0);
			kommand = kommandon.nextInt();
			
			
			if(slump.arraySorted == true)
			{
				//Om sant s� kan man k�ra alla kommandon.
				if(kommand == 1)
				{
					slump.populate();
					slump.display();
				}
				else if(kommand == 2)
				{
					slump.sort();
					slump.display();
				}
				else if(kommand == 3)
				{
					//TODO skapa metod som hanterar s�n h�r bajs
					slump.statistics();
				}
				else if(kommand == 4)
				{
					//TODO skapa metod som hanterar s�n h�r bajs
					System.out.print("Skriv ett nummer du vill s�ka efter i array'n: ");
					kommand = kommandon.nextInt();
					slump.binarySearch(kommand);
				}
			}
			else if(slump.arraySorted == false && slump.arrayPopulated == true)
			{
				//Om detta �r sant s� kan man bara k�ra kommando 1 och 2.
				if(kommand == 1)
				{
					slump.populate();
					slump.display();
				}
				else if(kommand == 2)
				{
					slump.sort();
					slump.display();
				}
				else if(kommand > 2)
				{
					slump.msg(2, 0, 0, 0, 0);
				}
			}
			else if(slump.arraySorted == false && slump.arrayPopulated == false)
			{
				//Om detta �r sant s� kan man bara k�ra f�rsta kommandot.
				if(kommand == 1)
				{
					slump.populate();
					slump.display();
				}
				else if(kommand > 1)
				{
					slump.msg(1, 0, 0, 0, 0);
				}
			}
		}
	}
}
