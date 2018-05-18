package Histogram;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		final float N = 10000;
		Random rand = new Random();
		int rndNum = 3;
		int n=0;

		Histogram graph = new Histogram(1, 20);

		for (int a = 0; a < N; a++) {
			int sum = 0; // resetting the sum
			for (int i = 0; i < rndNum; i++) {
				 n = rand.nextInt(20) + 1;
				//System.out.println(" Number is: " + n);
				sum += n;
				
			}
			//System.out.println("Sum is: " +sum);
			int average = sum / rndNum;
			//System.out.println(average);
		
			//graph.submit(average);
			if(average==20)
				{System.out.println("an average of 20 exists");
				System.out.println("Number is: " + n);
				System.out.println("Sum is: " + sum);}
			//else
				//System.out.println(" average of 20 does not exists");
		}
	
		//System.out.println(graph);

	}
	
}
