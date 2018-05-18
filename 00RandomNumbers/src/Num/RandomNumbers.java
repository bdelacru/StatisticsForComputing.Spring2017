package Num;

import java.util.Random;

public class RandomNumbers{
   public static void main (String[] args){
   Random GenNum = new Random();
   int number, min=0,max=0;
   float sum=0, mean=sum/100;
   double std=0, difference=0,root=0,sum2=0,variance=0;

         for(int counter=1; counter<=100; counter++){ 
            number = 1+GenNum.nextInt(100);
            //System.out.println(number + " ");
            
           //finding the min 
            if( counter == 1 )
               min = number;
           else
            if (number < min)
               min = number;
                 
          //finding the max       
            if(number > max)
               {
               max = number;
               } 
          //finding the sum to use in the mean     
            sum+=number;
           //finding the mean
            mean=sum/100;
                     //the start of finding the std dev
                     for(int i=1; i<=100; i++){
                     difference=number-mean;
               }
               
           }
     // continue of finding the std dev      
      for (int a=1; a<=100; a++){
      root= Math.pow(difference,2);
        }   
      for(int b=1; b<=100; b++){
      sum2+=root;      
      }
     variance=sum2/100;
     std= Math.pow(variance,0.5);  
 // Printing out     
  System.out.printf(" min: %d\n max: %d\n mean: %.1f\n Std dev: %.1f\n", min, max, mean, std); 
}
}
