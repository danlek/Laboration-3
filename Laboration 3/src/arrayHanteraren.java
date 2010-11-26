import java.util.Random;
public class arrayHanteraren 
{
	private int[] slumpadeTal = new int[100];
	private int dice()
	{
		Random dice = new Random();
		return dice.nextInt(900);
	}
	public void populate()
	{
		//int[] slumpadeTal = new int[100];
		for(int i = 0; i < 100; i++)
		{
			slumpadeTal[i] = dice();
		}
	}
	public void display()
	{
		int counter = 0;
		for(int i = 0; i < 10; i++)
		{
			for(int j = counter; j < (counter + 10); j++)
			{
				System.out.print(slumpadeTal[j] + " ");
			}
			System.out.println("");//radbyte
			counter = counter + 10;
		}
		
	}
	public void sort()
	{
		int tal1;
		int tal2;
		boolean sorted = false;
		boolean swaped = false;
		
		while(sorted == false)
		{
			swaped = false;
			for(int k = 0; k < 99; k++)
			{
				tal1 = slumpadeTal[k];
				tal2 = slumpadeTal[k + 1];
				if(tal1 > tal2)
				{
					slumpadeTal[k + 1] = tal1;
					slumpadeTal[k] = tal2;
					swaped = true;
				}
				else if(k == 98 && swaped == false)
				{
					sorted = true;
				}
			}
		}
	}
	
}
