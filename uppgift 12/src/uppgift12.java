import java.util.Scanner;
public class uppgift12 
{

	public static void main(String[] args) 
	{
		int tal = 1;
		Scanner inkommande = new Scanner(System.in);
		
		while(tal != 0)
		{
			System.out.println("Mata in ett tal!");
			tal = inkommande.nextInt();
			if((tal % 2) == 0)
			{
				System.out.println("Jämn tal!");
			}
			else
			{
				System.out.println("Ojämn tal!");
			}
		}

	}

}
