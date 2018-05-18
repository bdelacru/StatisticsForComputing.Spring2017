package histogram_Illinois;
import java.io.*;
import java.util.Scanner;

public class AvgWindHisto {

	public static void main(String[] args) throws FileNotFoundException
	{
			Histogram graph = new Histogram(0,9); // contructor 
		   Scanner in = new Scanner(new File("avg_wind_speed.txt"));
	        
	       String  lines;
	        
	        	
	        while (in.hasNextLine())
	        	
	        {
	            lines = in.nextLine();
	            
	            System.out.println(Integer.parseInt(lines.substring(0,1))); 
	            // substring of lines integer.parseInt to turn String to numbers
	            graph.submit(Integer.parseInt(lines.substring(0,1))); // gets the character at 0 index 
	     
	            
	        }
	        System.out.println(graph);
	        	in.close();
	        	
	}
		
}
