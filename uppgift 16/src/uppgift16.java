import java.util.Random;


public class uppgift16 
{
	public static int[] lotto = new int[7];
	
	public static void main(String[] args) 
	{
		int tal;
		tal = dice();
		lotto[0] = tal;
		
		for(int i = 1; i < 7; i++)
		{
			recursiveController(i);
		}
		
		show();
	}


	public static void recursiveController(int positionInArray)
	{
		int tal;
		tal = dice();
		boolean unik = false;
		boolean reroll = true;
		while(unik == false)
		{
			reroll = false;
			for(int k = 0; k < positionInArray; k++)
			{
				if(tal == lotto[k])
				{
					reroll = true;	
				}
				else if(k == (positionInArray - 1) && reroll == false)
				{
					lotto[positionInArray] = tal;
					unik = true;
				}
				
			}
			tal = dice();
		}
	}
	public static int dice()
	{
		Random dice = new Random();
		return (1 + dice.nextInt(7));
	}
	public static void show()
	{
		System.out.print("Lottorad: ");
		for(int j = 0; j < 7; j++)
			{
				System.out.print(lotto[j] + " ");
			}
	}
}
