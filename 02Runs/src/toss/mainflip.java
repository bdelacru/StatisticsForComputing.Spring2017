package toss;

public class mainflip {

	public static void main(String[] args)
	{
		final int N = 100; // constant
		System.out.println("N="+ N);
		// N in an array
		int[] flips = new int[N];
		
		//Constructor to have 1 and 2
		MultiDie coin= new MultiDie(2); 
		
		//tossing the coin
		for( int i=1; i<= N; i++)
		{
			coin.roll();
			int x = coin.getFaceValue();
			flips[i-1] = x; // puts the values in the array
			//displaying the outcome of each toss
			System.out.print(x);
		}	
		// setting up the run
		int run=1;
		int count = 0;
		for (int j = 0; j < N; ++j)
		{
			if (j == 0)
			{
				count = 1;
			}
			else if (flips[j] == flips[j-1])  // 0 == n^th array element 
			{
				count++;
			}
			else
			{
				if (count > run)
				{
					run = count;
				}
				count = 1;
			}

		}
		System.out.println();
		System.out.println("run is " + run);
	}
	
}
