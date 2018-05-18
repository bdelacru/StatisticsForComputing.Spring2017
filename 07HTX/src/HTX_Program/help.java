package HTX_Program;

import java.util.Random;

public class help {
	public static int coinFlip() {
		
		Random rand = new Random();
		int r = rand.nextInt(2);
		return r;
	}
	
	public static void main(String[] args) {
		String sequenceSoFar = "";
		sequenceSoFar += coinFlip();
		sequenceSoFar += coinFlip();
		sequenceSoFar += coinFlip();
		int count = 3;
		if(!sequenceSoFar.equals("010")) {
			while(!(sequenceSoFar.substring(sequenceSoFar.length() - 3).equals("010"))) {
				sequenceSoFar += coinFlip();
				count++;
			}
		}
		System.out.println(sequenceSoFar);
		System.out.println(count);
	}
}