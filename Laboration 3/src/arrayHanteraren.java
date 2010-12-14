import java.util.Random;
/**
 * The arrayHanteraren class holds the array and handles nearly all the logic of this program.
 * 
 */
public class arrayHanteraren 
{
	private int[] slumpadeTal = new int[100];
	public boolean arrayPopulated = false;
	public boolean arraySorted = false;
	/**
	 * The dice() method randomizes a number within the range 0 - 900 and 
	 * returns the value to the part of the program that called it.
	 */
	private int dice()
	{
		Random dice = new Random();
		return dice.nextInt(900);
	}
	/**
	 * A simple get() function
	 */
	private int get(int index)
	{
		return slumpadeTal[index];
	}
	/**
	 * A simple set() function
	 */
	private void set(int index, int value)
	{
		slumpadeTal[index] = value;
	}
	/**
	 * The populate() method populates the array with randomized values
	 */
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
	/**
	 * The display() method gets the values from the array and formats the output on the 
	 * screen to conform with the specifications for the program.
	 */
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
	/**
	 * sort() method orders the values in the array in the order of 
	 * smallest to largest. Uses a so called bubble sort algorithm.
	 */
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
	/**
	 * statistics() method returns basic statistics of the values in the array. Minimum, maximum,
	 * median and mean values.
	 */
	public void statistics()
	{
		int sum = 0;
		//medianen är vid index 49!
		for(int l = 0; l < 100; l++)
		{
			sum = sum + get(l);
		}
//		System.out.println("Minsta talet är: " + get(0));
//		System.out.println("Största talet är: " + get(99));
//		System.out.println("Medianen är: " + get(49));
//		System.out.println("Medelvärdet är: " + ((double)sum/(double)100));
//		System.out.println("");
		msg(6, get(0), get(99), get(49), ((double)sum/(double)100));
	}
	/**
	 * binarySearch() method does a binary search (duh) looking for the user specified value in the
	 * array. If it finds the value in the array the user will be notified of which row and column
	 * it is in. Else if the value is not found in the array, the user will be notified of this.
	 */
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
				//System.out.println("Talet finns ej i array'n!");
				msg(5, 0, 0, 0, 0);
				done = true;
			}
			else if(get(precisIMitten) > targetNumber)
			{
				//För stor!
				upperBound = precisIMitten - 1;
				precisIMitten = (lowerBound + upperBound )/2;
				//System.out.println("För stort! Precis i mitten värdet är " + precisIMitten + "upper och lower är" + upperBound + " " + lowerBound);
			}
			else if(get(precisIMitten) < targetNumber)
			{
				//För liten!
				lowerBound = precisIMitten + 1;
				precisIMitten = (lowerBound + upperBound )/2;
				//System.out.println("För litet! Precis i mitten värdet är " + precisIMitten + "upper och lower är" + upperBound + " " + lowerBound);
			}
			else if(get(precisIMitten) == targetNumber)
			{
				//bingo!
				//System.out.println("Talet finns på index " + precisIMitten);
				int counter = 0;
				int rest = precisIMitten;
				while(rest >= 10)
				{
					rest = rest - 10;
					counter++;
				}
				rest++;//detta gör så att kolumnerna börjar på 1 istället för 0 ta bort om du vill inte ha det så
				counter++;//detta gör så att raderna börjar på 1 istället för 0 ta bort om du vill inte ha det så
				//System.out.println("Talet finns på rad " + counter + " och kolumn " + rest);
				msg(4, counter, rest, 0, 0);
				done = true;
			}
			
		}
	}
	/**
	 * msg() method was something I designed first with error messages in mind. Later on I decided to
	 * build a bit more on it and made if return other standard messages.
	 */
	public void msg(int Typ, int arg1, int arg2, int arg3, double arg4)
	{
		switch(Typ)
		{
		case 1: System.out.println("Du måste skapa en array med slumpade siffor innan du kan ordna det. Välj alternativ 1 först");
				System.out.println("");
				break;
		case 2: System.out.println("Du måste ordna talföljden innan du kan söka efter specifika tal eller få ut statistik om talföljden." +
				"\nVälj alternativ 2 först");
				System.out.println("");
				break;
		case 3: System.out.println("1) Skapa en array med slumpade siffor! 2) Ordna array'n! 3) Få statistik om siffrorna i array'n!" +
				" 4) Sök efter ett specifikt tal i array'n 0) Avsluta");
				System.out.println("");
				break;
		case 4: System.out.println("Talet finns på rad " + arg1 + " och kolumn " + arg2);
				System.out.println("");
				break;
		case 5: System.out.println("Talet finns ej i array'n!");
				System.out.println("");
				break;
		case 6: System.out.println("Minsta talet är: " + arg1);
				System.out.println("Största talet är: " + arg2);
				System.out.println("Medianen är: " + arg3);
				System.out.println("Medelvärdet är: " + arg4);
				System.out.println("");
				break;
		}
	}
}
