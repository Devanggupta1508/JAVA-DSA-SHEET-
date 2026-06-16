import java.util.*;

class ArrayCC {
    public static void sortingMethod(int arr[]){
            

       for(int i=0;i<arr.length-1;i++){

         boolean swapped = false; 

        for(int j=0;j<arr.length-1-i;j++){

              if(arr[j]>arr[j+1]){
               

            int temp = arr[j];
           arr[j] = arr[j+1];
            arr[j+1] = temp;
             swapped = true;
                                         } 
        
                                                }
          
                                    if(!swapped){

                                     break;
          
                                                }
    
                                            }
          
    
                                            System.out.println(Arrays.toString(arr));  
   
                                        }

          
    }









public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,4,1,3,2};
         ArrayCC.sortingMethod(arr);
    }
}
