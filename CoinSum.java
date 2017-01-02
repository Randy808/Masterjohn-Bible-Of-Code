/* MARCUS C. HINES */

import java.util.*;
public class CoinSum{

    public static void main(String args[]){
        printAllSums(10,15,20);
    }



//Another approach that uses less space
    public static void printAllSums(int c1, int c2, int c3){
        int arr[] = {c1,c2,c3};
        Arrays.sort(arr);
        
        //Since there are only 3 coins, we can just list the combinations; which is the same as listing possible divisors
        int divisors[] = {arr[0], arr[1], arr[2], arr[0] + arr[1], arr[0] + arr[2], arr[1] + arr[2]};

        //Loop from smallest coin to 1000, printing every 'i' iff. it has a divisor listed in our 'divisors[]' array
        for(int i = arr[0]; i <= 1000; i++)
            if(i % divisors[0] == 0 || i % divisors[1] == 0 || i % divisors[2] == 0 || i % divisors[3] == 0 || i % divisors[4] == 0 || i % divisors[5] == 0){
              System.out.println(i);
            
        }
    }





