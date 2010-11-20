
public class uppgift10 
{
	public static void main(String[] args) 
	{
		int tal = 0;
		int summa = 0;
		
		while(summa < 100)
		{
			tal++;
			summa = summa + tal;
		}
		
		System.out.println("Summan är: " + summa + " och sista talet var: " + tal);
		
	}

}
