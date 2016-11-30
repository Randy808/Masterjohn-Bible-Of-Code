/**********************joemasterjohn*************************
*							   								*
* Implemented by Marcus Hines  								*
* Given 3 coins of different values, print all the sums of  *
* the coins up to 1000. Must be printed in order.			*
* ex: coins(10, 15, 55) 10 15 20 25 30 . . . 1000 			*	
*							   								*
*************************************************************/


import java.util.*;

public class 3Coins{
	
	public static void main(String args[]){
	  coins(10,15,55);
	}
	
	public static void coins(int a, int b, int c){
		boolean table[] = new boolean[1000];
		table[0] = true;
		int[] array = {a,b,c};
		Arrays.sort(array);
		
		
		for(int i = 1; i < 1000; i++){
	      if( (i-array[0] >= 0 && table[i-array[0]]) ||
	    		  (i-array[1] >= 0 && table[i-array[1]]) ||
	    		  (i-array[2] >= 0 && table[i-array[2]])
	    		  ){
			  table[i] = true;
			  System.out.print(i + "\t");
			 
			}
			
		}
		
	}
	
}