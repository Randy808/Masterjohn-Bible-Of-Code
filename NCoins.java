/**********************joemasterjohn*************************
*							   								*
* Implemented by Marcus Hines  								*
* Given 3 coins of different values, print all the sums of  *
* the coins up to 1000. Must be printed in order.			*
* ex: coins(10, 15, 55) 10 15 20 25 30 . . . 1000 			*	
*							   								*
*************************************************************/


import java.util.*;

public class NCoins {
	
  public static void main(String args[]){
    coins(1000, 10, 15, 20);
  }
  
  public static boolean sat(boolean [] table, int[] array, int x) {

    for(int i = 0; i < array.length; i++) {
      if(x - array[i] >= 0 && table[x - array[i]]) return true;
    }

    return false;
  }

  public static void coins(int limit, int ... array){
  
    boolean table[] = new boolean[limit];
    table[0] = true;
    Arrays.sort(array);
    
    
    for(int i = 1; i < limit; i++){
      if(sat(table, array, i)) {
        table[i] = true;
        System.out.print(i + "\t");
      }
    }
    System.out.println();
  	
  }
	
}
