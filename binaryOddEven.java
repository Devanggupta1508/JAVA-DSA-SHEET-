import java.util.Scanner ;

class binaryOddEven {
    public static void main(String[] args){
         Scanner sc = new  Scanner(System.in);
         System.out.println("Enter the Number");
           int dec = sc.nextInt();
          
         if((dec & 1) ==0){
           
            System.out.println("Even Number");
         }else{
            System.out.println("odd Number");
         }
    }
}