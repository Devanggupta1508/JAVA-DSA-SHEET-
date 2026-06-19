import java.util.*;

class countingSort{
 
    public static void  countingMethod(int[] arr){
        
          int largest = Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
             largest = Math.max(largest,arr[i]);
             
         }

      
        //    counting frequency 

             int[] count = new int[largest+1]; 

             for(int i =0;i<arr.length;i++){
                 count[arr[i]]++;
                 
                 System.out.println(Arrays.toString(count));  
             }

            // sorting 
            int j = 0;
            for(int i = 0;i<count.length;i++){
                     while(count[i]>0){
                 arr[j] = i;
                 j++;
                 count[i]--;
             }

           
            }
            
              System.out.println("Sorted Array =" +Arrays.toString(arr));
            
            
                } 

    







    public static void main(String[] args){
        int[] arr = {1,4,1,3,2,4,3,7};
        countingMethod(arr); 
    }
}
