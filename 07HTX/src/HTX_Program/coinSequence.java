package HTX_Program;

public class coinSequence {
	public static int coinFlip() {
		MultiDie coin = new MultiDie(2);
		coin.roll();
		int x = coin.getFaceValue();
		return x;
	} // get H or T

	public static void main(String[] args) {
	    final float N=3;
	    int totalFlips = 0;

	    for(int i=0; i<N; i++){
	        String sequenceSoFar = ""; // empty string list
	        sequenceSoFar += coinFlip(); // append to string
	        sequenceSoFar += coinFlip();
	        sequenceSoFar += coinFlip();
	        int count = 3;
	        totalFlips += 3; // add initial 3 flips to total.
	        // if the first three aren't the sequence, then keep going until the sequence is met in the while loop
	        if(!sequenceSoFar.equals("121")) {
	            while(!(sequenceSoFar.substring(sequenceSoFar.length() - 3).equals("121"))) {
	                sequenceSoFar += coinFlip();
	                count++;
	                totalFlips++;
	            }
	        }
	        // to check my work with small numbers
	        System.out.println(sequenceSoFar);
	       System.out.println(count);
	    }
	    System.out.println("Sequence for HTH: ");
	    System.out.println("Total Flips: " + N);
	    System.out.println("Total flips sum: " + totalFlips);
	    double average = (totalFlips * 1.0) /(double) N;
	    System.out.println("Average flips: " + average);
	}
}