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
				if(get(j) >= 100)
				{
					System.out.print(get(j) + " ");
				}
				else if(get(j) < 100 && get(j) > 10)
				{
					System.out.print(get(j) + "  ");
				}
				else if(get(j) < 10)
				{
					System.out.print(get(j) + "   ");
				}
			}
			System.out.println("");//radbyte
			counter = counter + 10;
		}
		System.out.println("");//radbyte
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
	public void statistics()
	{
		int sum = 0;
		//medianen �r vid index 49!
		for(int l = 0; l < 100; l++)
		{
			sum = sum + get(l);
		}
		System.out.println("Minsta talet �r: " + get(0));
		System.out.println("St�rsta talet �r: " + get(99));
		System.out.println("Medianen �r: " + get(49));
		System.out.println("Medelv�rdet �r: " + ((double)sum/(double)100));
		System.out.println("");
	}
	public void binarySearch(int targetNumber)
	{
		int lowerBound = 0;
		int upperBound = 99;
		int precisIMitten = (lowerBound + upperBound )/2;
		boolean done = false;
		while(done == false)
		{
			if(lowerBound > upperBound)
			{
				//talet finns inte i array'n!
				System.out.println("Talet finns ej i array'n!");
				done = true;
			}
			else if(get(precisIMitten) > targetNumber)
			{
				//F�r stor!
				upperBound = precisIMitten - 1;
				precisIMitten = (lowerBound + upperBound )/2;
				//System.out.println("F�r stort! Precis i mitten v�rdet �r " + precisIMitten + "upper och lower �r" + upperBound + " " + lowerBound);
			}
			else if(get(precisIMitten) < targetNumber)
			{
				//F�r liten!
				lowerBound = precisIMitten + 1;
				precisIMitten = (lowerBound + upperBound )/2;
				//System.out.println("F�r litet! Precis i mitten v�rdet �r " + precisIMitten + "upper och lower �r" + upperBound + " " + lowerBound);
			}
			else if(get(precisIMitten) == targetNumber)
			{
				//bingo!
				//System.out.println("Talet finns p� index " + precisIMitten);
				int counter = 0;
				int rest = precisIMitten;
				while(rest >= 10)
				{
					rest = rest - 10;
					counter++;
				}
				rest++;//detta g�r s� att kolumnerna b�rjar p� 1 ist�llet f�r 0 ta bort om du vill inte ha det s�
				counter++;//detta g�r s� att raderna b�rjar p� 1 ist�llet f�r 0 ta bort om du vill inte ha det s�
				System.out.println("Talet finns p� rad " + counter + " och kolumn " + rest);
				done = true;
			}
			
		}
	}
	public void msg(int Typ)
	{
		switch(Typ)
		{
		case 1: System.out.println("Du m�ste skapa en array med slumpade siffor innan du kan ordna det. V�lj alternativ 1 f�rst");
				break;
		case 2: System.out.println("Du m�ste ordna talf�ljden innan du kan s�ka efter specifika tal eller f� ut statistik om talf�ljden." +
				"\nV�lj alternativ 2 f�rst");
				break;
		case 3: System.out.println("1) Skapa en array med slumpade siffor! 2) Ordna array'n! 3) F� statistik om siffrorna i array'n!" +
				" 4) S�k efter ett specifikt tal i array'n");
				break;
		}
	}
}
