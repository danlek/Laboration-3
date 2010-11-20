
public class uppgift11 
{

	public static void main(String[] args) 
	{
		boolean done = false;
		boolean backwards = false;
		int i = 64;
		/*
		for(int i = 65; i < 91; i++)
		{
			System.out.println((char) i);
		}
		*/
		
		while(done == false)
		{
			if(i < 90 && backwards == false)
			{
				i++;
				System.out.println((char) i);
			}
			if(i == 90)
			{
				backwards = true;
				i--;
				System.out.println((char) i);
			}
			if(i < 90 && backwards == true)
			{
				i--;
				System.out.println((char) i);
			}
			if(i == 65 && backwards == true)
			{
				//System.out.println((char) i);
				done = true;
			}
		}
	}

}
