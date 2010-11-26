import java.util.Random;
public class arrayHanteraren 
{
	private int[] slumpadeTal = new int[100];
	public boolean arrayPopulated = false;
	public boolean arraySorted = false;
	private int dice()
	{
		Random dice = new Random();
		return dice.nextInt(900);
	}
	private int get(int index)
	{
		return slumpadeTal[index];
	}
	private void set(int index, int value)
	{
		slumpadeTal[index] = value;
	}
	public void populate()
	{
		for(int i = 0; i < 100; i++)
		{
			//slumpadeTal[i] = dice();
			set(i, dice());
		}
		arrayPopulated = true;
		arraySorted = false;
	}
	public void display()
	{
		int counter = 0;
		for(int i = 0; i < 10; i++)
		{
			for(int j = counter; j < (counter + 10); j++)
			{
				//System.out.print(slumpadeTal[j] + " ");
				System.out.print(get(j) + " ");
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
				//tal1 = slumpadeTal[k];
				//tal2 = slumpadeTal[k + 1];
				tal1 = get(k);
				tal2 = get(k + 1);
				if(tal1 > tal2)
				{
					//slumpadeTal[k + 1] = tal1;
					//slumpadeTal[k] = tal2;
					set(k + 1, tal1);
					set(k, tal2);
					swaped = true;
				}
				else if(k == 98 && swaped == false)
				{
					sorted = true;
				}
			}
		}
		arraySorted = true;
	}
	public void msg(int Typ)
	{
		String msg;
		switch(Typ)
		{
		case 1: System.out.println("Du måste skapa en array med slumpade siffor innan du kan ordna det. Välj alternativ 1 först");
				break;
		case 2: System.out.println("Du måste ordna talföljden innan du kan söka efter specifika tal eller få ut statistik om talföljden." +
				"\nVälj alternativ 2 först");
				break;
		case 3: System.out.println("1) Skapa en array med slumpade siffor! 2) Ordna array'n! 3) Få statistik om siffrorna i array'n!" +
				" 4) Sök efter ett specifikt tal i array'n");
				break;
		}
		
		
	}
}
