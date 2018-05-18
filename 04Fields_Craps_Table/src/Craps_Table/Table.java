package Craps_Table;
public class Table {
	public static void main(String[] args) {
		MultiDie dice= new MultiDie(6);
		int Money = 10 ; //initial amount bet
		final int N=1000000; // number of times played  
		int gainCount20=0, gainCount10=0,lostCount10=0;
			for( int i=1; i<= N; i++)
			{
				dice.roll();
				int one= dice.getFaceValue();
				//System.out.println("First Dice:" + one);
				 dice.roll();
				 int two= dice.getFaceValue();
			//System.out.println("Second Dice:" + two);
				int x = one + two;
				//System.out.println("Total: " + x);
					if(x==2 || x==12)
					{
						int win20Money= Money + 20;
						Money= win20Money; 
						gainCount20++;
						//System.out.println("Amount of Money= " + win20Money);
					}
					else 
					{
							if(x==3|| x==4 || x==9 || x==10 || x==11) 
							{
								int win10Money= Money+ 10;
								gainCount10++;	
								//System.out.println("Amount of Money= " + win10Money);
							}
							else 
							{ 
								int lose10Money= Money- 10;
								lostCount10++;	
								Money=lose10Money;
								//System.out.println("Amount of Money= " + lose10Money);		
							}	
					}
			}
			
			int a= gainCount20*20;int b= gainCount10*10;int c= lostCount10*10;
			int average_gain= (a+b)/N;
			int average_lost= (c/N);
			System.out.printf("Total gain: %d\n", a+b);
			System.out.printf("Total lost: %d\n", c);
			System.out.printf("Average gain: %d\n", average_gain); 
			System.out.printf("Average lost: %d\n",average_lost);
	}
}
