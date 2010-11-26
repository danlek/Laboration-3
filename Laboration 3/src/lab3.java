import java.util.Scanner;
public class lab3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		arrayHanteraren slump = new arrayHanteraren();
		System.out.println("1 för att skapa en array med slumpade siffor! 2 för att ordna arrayen!");
		Scanner kommandon = new Scanner(System.in);
		int kommand = kommandon.nextInt();
		
		
		
			if(kommand == 1)
			{
				slump.populate();
				slump.display();
			}
			else if(kommand == 2)
			{
				slump.populate();
				slump.display();
				slump.sort();
				slump.display();
			}
		
	}

}
