import java.util.*;
public class ArrayCreation {
    
    public static void findArr(int arr[][],int key){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                if(key==arr[i][j]){
                    System.out.println("value found in the index of " +i + " "+j);
                    return;
                       
                }
                 
            }
        }

        System.out.println("element not found");

         
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Row");
        int row = sc.nextInt();
        System.out.println("Enter the Size of the Column");
         int column = sc.nextInt();

        int[][] arr = new int[row][column];  

        for(int i=0;i<row;i++){
            for(int j=0; j<column;j++){

                          System.out.println("Enter the value of the " + i +" " + j + " of the index");

                arr[i][j] = sc.nextInt();
            }
           
        }
System.out.println("Prented Array with Deep method "+Arrays.deepToString(arr));  

  for(int i=0;i<row;i++){
     for(int j=0;j<column;j++){
        System.out.print(arr[i][j]+" "); 
    }
      System.out.println(" ");

     
  }

     System.out.println("Enter the value you find in the array");
     int key = sc.nextInt();

     ArrayCreation.findArr(arr,key);

        
 }     
}
