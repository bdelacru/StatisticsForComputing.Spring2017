package secondProject;

public class MainFlip {
	public static void main (String[] args)
	{
		int headsCount=0;
		int tailsCount=0;
		// ratio=0;
		
		
		final int N = 10 ; // constants for declaring the flips later on
	
		
		MultiDie coin= new MultiDie(2); // Constructor
		
		for( int i=1; i<= N; i++){
			//tossing the coin
			coin.roll();
			int x = coin.getFaceValue();
			//displaying the outcome of each tosee
			System.out.printf( "  %d\n", x);
			
			//counting each outcome
			  if (x==1)
			{
				headsCount++;
			}
			else {
				tailsCount++;
			}
			 
		}
		
	System.out.println("N="+ N);			
	System.out.printf("Total heads: %d\n", headsCount);
	//calculating ratio
	double ratio  = (double)headsCount/N;
	System.out.printf("Ratio of Heads= %.5f\n", ratio);
				
	}
}
