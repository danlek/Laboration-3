import java.util.Scanner;
/**
 * Slumpatron version 1.0
 * Slumpatron has four major functions. First function populates an array with one hundred random
 * numbers, within the interval 0 - 900.
 * The second function is a so called bubble sort algorithm that sorts the values in the array in the
 * order of from smallest to largest.
 * Third function returns the minimum, maximum, median and mean value of the values in the array.
 * The fourth and final function is a search function. The users specifies a number and the function
 * will search for it in the array.
 * @author danlek
 *
 */
public class lab3 
{
	/**
	 * The main function creates an instance of the arrayHanteraren class and then 
	 * goes into a while loop until the user terminates the loop with a 0 input.
	 */
	public static void main(String[] args) 
	{
		arrayHanteraren slump = new arrayHanteraren();
		Scanner kommandon = new Scanner(System.in);
		int kommand = 1;

		System.out.println("Välkommen till Slumpatron version 1.0! \nVälj bland följande alternativ!");
		while(kommand != 0)
		{
			slump.msg(3, 0, 0, 0, 0);
			kommand = kommandon.nextInt();
			
			
			if(slump.arraySorted == true)
			{
				//Om sant så kan man köra alla kommandon.
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
					slump.statistics();
				}
				else if(kommand == 4)
				{
					System.out.print("Skriv ett nummer du vill söka efter i array'n: ");
					kommand = kommandon.nextInt();
					slump.binarySearch(kommand);
				}
			}
			else if(slump.arraySorted == false && slump.arrayPopulated == true)
			{
				//Om detta är sant så kan man bara köra kommando 1 och 2.
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
				//Om detta är sant så kan man bara köra första kommandot.
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
