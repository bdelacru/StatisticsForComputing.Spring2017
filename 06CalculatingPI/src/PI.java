import java.util.Random;
public class PI {

	public static void main(String[] args) {
		Random GenNum = new Random();
		float x,y,PI;
		int count=0, countOut=0;
		final float coordinates=1000000;
		
		for(int i=1; i<=coordinates;i++)
		{			
		x=GenNum.nextFloat();
		y=GenNum.nextFloat();
		// for my purpose to hand calculate for accuracy
		//System.out.println("x is " + x);
		//System.out.println("y is " + y);
			if ( x*x+y*y<1)
				count++;
			else
				countOut++;
		}
		PI=(float)count/coordinates*4;
		System.out.println("Number of coordinates: " + coordinates);
		System.out.println("Coordinates inside the circle: " + count);
		System.out.println("Coordinates outside the circle: " + countOut);
		System.out.println("Approximation to PI is " + PI);
	}
}
