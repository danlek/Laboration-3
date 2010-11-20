import java.util.Scanner;
public class uppgift13 
{

	public static void main(String[] args) 
	{
		double brutto, netto, limit;
		limit = 204000.0;
		Scanner inkommande = new Scanner(System.in);
		System.out.println("Mata in brutto inkomst");
		brutto = inkommande.nextDouble();
		if(brutto > limit)
		{
			netto = brutto - (0.5 * brutto);
			System.out.println("Netto är " + netto);
		}
		else
		{
			netto = brutto - (0.3 * brutto);
			System.out.println("Netto är " + netto);
		}
	}

}
