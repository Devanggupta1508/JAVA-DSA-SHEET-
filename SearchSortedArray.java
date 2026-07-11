import java.util.Scanner; 


public class SearchSortedArray {
    
    public static void stairCaseSearch(int[][] arr, int key) {

    int row = 0;
    int col = arr[0].length - 1;

    while(row < arr.length && col >= 0) {

        if(arr[row][col] == key) {
            System.out.println("Key found at index (" + row + ", " + col + ")");
            return;
        }
        else if(key < arr[row][col]) {
            col--;
        }
        else {
            row++;
        } 
    }

    System.out.println("Key not found: " + key);


        
             
        
    }


    public static void main(String[] args){
        
      Scanner sc = new Scanner(System.in);
         int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37, 48},
            {32,33,39,50}
         };
         System.out.println("Enter the the Key ");
          int key = sc.nextInt();

         stairCaseSearch(arr,key); 
          
    }
}
