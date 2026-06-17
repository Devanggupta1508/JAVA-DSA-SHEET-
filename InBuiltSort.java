import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
    public static void main(String[] args){

        int[] arr = {2,5,4,6,1,3};
        int[] arr2 = {10,9,2,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("with range assending");
         
        System.out.println("sort with range");

         Arrays.sort(arr2,2,4);
System.out.println(Arrays.toString(arr2));

         System.out.println("descending order");

         Integer[] arr3 = {5,4,2,6,1};
         Arrays.sort(arr3,Collections.reverseOrder());

            System.out.println("reverse Array" +Arrays.toString(arr3));
        
    }
}
