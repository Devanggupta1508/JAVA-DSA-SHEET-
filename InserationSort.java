import java.util.*;
public class InserationSort {
    
    public static void InserationMethod(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            int currentElement = arr[i];
            int prev = i-1;

            //finding out the current postion to insert 

            while(prev>=0 && arr[prev] > currentElement){
               
                arr[prev+1] = arr[prev];
                  prev--;

            } 
            //insertation 
            arr[prev+1] = currentElement;
               
    }
    System.out.println(Arrays.toString(arr)); 
    }

    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
        InserationMethod(arr);
    }
} 
