import java.util.Random;


public class uppgift16 
{

	public static void main(String[] args) 
	{
		int i;
		double tal;
		int lotto[] = new int[7];
		
		for(i = 0; i < 7; i++)
		{
			System.out.println("For-loopen börjar / börjar om");
			tal = 1 + Math.random() * 34;
			
			for(int k = 0; k < 7; k++)
			{
				System.out.println("Här börjar kontroll-loopen");
				if(lotto[k] == (int)tal)
				{
					System.out.println(lotto[k] + " " + (int)tal);
					if(i == 0)
					{
						
						k = 8;
					}
					else
					{
						
						i = i--;
						k = 8;
					}
					
				}
				else
				{
					
					lotto[i] = (int)tal;
					
				}
			}
			
		}
		
		
		for(int j = 0; j < 7; j++)
		{
			System.out.print(lotto[j] + " ");
		}
		
	}

}
