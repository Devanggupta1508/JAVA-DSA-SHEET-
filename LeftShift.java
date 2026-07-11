import java.util.Scanner;
public class LeftShift {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal num");
        int dec = sc.nextInt(); 
        System.out.println("Enter the shift");
        int shift = sc.nextInt(); 

        System.out.println(dec<<shift);
          
    }
}
