import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uppgift15 
{
	public static void main(String[] args) 
	{
		ArrayList randomSiffror = new ArrayList();
		Scanner inkommande = new Scanner(System.in);
		int tal = 1;
		int summa = 0;
		int counter;
		int forstaSiffra;
		int andraSiffra;
		boolean keepOnIt = true;
		
		//while loop för att samla in värden från användaren. Värdena summeras också för att senare användas för att
		//beräkna medelvärdet.
		System.out.println("Mata in random siffor! Tryck 0 för att avsluta inmatningsfasen.");
		while(tal != 0)
		{
			
			try 
			{
				tal = inkommande.nextInt();
				
					summa = summa + tal;
					if(tal != 0)
					{
						randomSiffror.add(tal);
					}
					else
					{
						if(randomSiffror.size() < 1)
						{
							tal = 1;
							System.out.println("Tack och hej, leverpastej\n");
							System.exit(1);
						}
					}
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("Numbers retard! DO YOU USE THEM?!");
				System.exit(1);				
			}
			
			
			
		}
		//Inmatning av värden är över, nu sorteras arrayen värdena i storleksordning i en for loop som körs tills den
		//har kört genom ett helt iteration utan att behövt flytta på tal och då bryts while loopen den sitter i.
		//Värden printas ut på skärmen
		counter = randomSiffror.size();
		if(counter == 1)
		{
			System.out.println("Fick bara ett värde, ie är största och minsta talet " + randomSiffror.get(0) + " och medelvärdet är " + randomSiffror.get(0));
		}
		else
		{
			while(keepOnIt == true)
			{
				boolean swapped = false;
				for(int i = 0; i < (counter - 1); i++)
				{
					forstaSiffra = (Integer) randomSiffror.get(i);
					andraSiffra = (Integer) randomSiffror.get(i + 1);
				
					if(forstaSiffra > andraSiffra)
					{
						randomSiffror.set((i + 1), forstaSiffra);
						randomSiffror.set(i, andraSiffra);
						swapped = true;					
					}
					else
					{
						if(i == (counter - 2) && swapped == false)
						{
							keepOnIt = false;
						}					
					}
				}
			}
		
			System.out.println(randomSiffror);
			System.out.println("Dem två minsta siffor är: " + randomSiffror.get(0) + " och " + randomSiffror.get(1));
			System.out.println("Dem två största siffor är " + randomSiffror.get(counter - 2) + " och " + randomSiffror.get(counter - 1));
			System.out.println("Medelvärdet är " + ((double)summa / (double)randomSiffror.size()));
		}
	}

}
