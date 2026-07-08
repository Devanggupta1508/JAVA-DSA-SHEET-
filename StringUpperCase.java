import java.util.Scanner ;

public class StringUpperCase {
   

    public static void UpperMethod(String str){   

             StringBuilder newString = new  StringBuilder (str) ; 
                 char ch = Character.toUpperCase(newString.charAt(0)); 
             
                 newString.setCharAt(0,ch);

              
            
        for(int i =1;i<str.length();i++){
               
            if(str.charAt(i) == ' ' && i<str.length()-1){

            char ch2 = Character.toUpperCase(newString.charAt(i+1));
                   
                   newString.setCharAt(i+1,ch2);
            }
          
          
    }
          System.out.println(newString);
    }

    public static void main(String[] args){ 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         String str = sc.nextLine();
             UpperMethod(str); 
    }

    
}
