import java.util.Scanner; 
class decimalToBinary {
    public static void main(String[] args){ 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
        int dec = sc.nextInt();
        int[] arr = new int[32]; 
        int i=0;
             
        for(;dec>0;i++){

            int quotent  = dec/2; 


            int remender = dec%2;  
               dec = quotent ;
             arr[i] = remender;
        }

   for(int j = i - 1; j >= 0; j--){
    System.out.print(arr[j]);

         }

    }
}