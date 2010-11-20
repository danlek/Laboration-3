import java.util.Scanner;
public class uppgift14 
{
	public static void main(String[] args) 
	{
		String personNummer;
		char manEllerMus;
		Scanner inkommande = new Scanner(System.in);
		
		System.out.printf("Mata in ditt personnummer: ");
		personNummer = inkommande.next();
		manEllerMus = personNummer.charAt(8);
		
		if((manEllerMus % 2) == 0)
		{
			System.out.println("Grattis du är en kvinna");
		}
		else
		{
			System.out.println("Grattis du är en man");
		}
		

	}

}
