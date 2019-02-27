// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Binary {


    public int solution(int[] A) {
       
       int binarianValue = binarian(A);
       
       return factorise(binarianValue, A);
    }
    
    
    public int binarian(int[] A) {
        
        int binarian = 0;
        
        for(int i= 0; i < A.length; i++) {
            //Raise 2 to the value
            binarian += (int)Math.pow(2, A[i]);
         }
    
        return binarian;
    }

    public int factorise(int bin, int[] arr) {
        
        int count = 0;
        int arrLength = arr.length;
        
        for(int i = arrLength - 1; i >= 0; i--) {
        int power = (int)Math.pow(2, i);

        //If the binarian found, break the loop
        if(power == bin) {
            count++;
            break;
        }

        //Calculate until value lower than binarian found
        //The new upper limit will be the difference between the binarian and the value of 2 raised to the index
        else if(power < bin) {
            count++;
            bin = bin - power;
        }
        }
        
        return count;
        
    }
}