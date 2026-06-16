import java.util.*;

public class SelectionSort {

    public static void SelectionShortMethod(int[] arr){
        
         for(int i=0;i<arr.length-1;i++){
            int minPos = i; 
           
            for(int j=i+1;j<arr.length;j++){
             if(arr[minPos]>arr[j]){

              minPos = j; }

            }
            //outer loop
            int temp = arr[i];
                 arr[i] = arr[minPos];
                 arr[minPos] = temp;  
         
         }
            
            System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
         SelectionShortMethod(arr);
    }
}
