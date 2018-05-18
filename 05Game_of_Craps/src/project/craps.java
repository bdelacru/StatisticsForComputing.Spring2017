package project;


public class craps {

	public static void main(String[] args) {
		MultiDie dice1= new MultiDie(6);
		MultiDie dice2= new MultiDie(6);
		
		final float trials=100000;
		int bet=10;
		
		int Total_Money=0;
		boolean a= false;
		int point;
			
		//System.out.println("Roll one: " + dice1.getFaceValue() + " Roll two: " + dice2.getFaceValue() + " Total: " + x);
		for (int i=1; i<=trials; i++)
		{	
			dice1.roll();
			dice2.roll();
			int x = dice1.getFaceValue() + dice2.getFaceValue();
			switch(x){
			case 2: case 3: case 12:
				//System.out.println("Craps. YOU LOSE!");
				Total_Money=Total_Money-bet;
				//System.out.println(" Your total money is: " + Total_Money );
				break;
			case 7: case 11:
			//	System.out.println("Neutral. YOU WIN!");
				Total_Money+=bet;
				//System.out.println(" Your total money is: " + Total_Money);
				break;
			case 4: case 5: case 6: case 8: case 9: case 10:
				//System.out.println("This is your point. Keep rolling to get your point, but if you get a 7, you loose");
				a=true; // if true you will go through loop 
				point=x; 
				while (a)
				{
					dice1.roll();
					dice2.roll();
					x = dice1.getFaceValue() + dice2.getFaceValue();	
					//System.out.println(" Sum: " + x);
					if( x==7 )
					{
					//	System.out.println(" You lose! ");
						Total_Money=Total_Money-bet;
				//System.out.println(" Your total money is: " + Total_Money);
						a=false;
					}
					else if(x==point)
					{
						//System.out.println(" You win! ");
						Total_Money+=bet;
					//System.out.println(" Your total money is: " + Total_Money);
						a=false;
					}
					
				}
				break;
			   default :
		            System.out.println("Invalid number");
			}

		}
		double average= (double)Total_Money/(double)trials;
		System.out.println(" Number of rounds: " + trials);
		System.out.println(" Total money: " + Total_Money);
		System.out.println(" Average Money loss: " + average);
	}

}
