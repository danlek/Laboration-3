import java.util.Scanner;
public class lab3 
{
	public static void main(String[] args) 
	{
		arrayHanteraren slump = new arrayHanteraren();
		Scanner kommandon = new Scanner(System.in);
		int kommand = 1;

		System.out.println("Välkommen till Slumpatron version 0.1! \nVälj bland följande alternativ!");
		while(kommand != 0)
		{
			slump.msg(3);
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
					//TODO skapa metod som hanterar sån här bajs
				}
				else if(kommand == 4)
				{
					//TODO skapa metod som hanterar sån här bajs
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
					slump.msg(2);
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
					slump.msg(1);
				}
			}
		}
	}
}
