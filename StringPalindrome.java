import java.util.Scanner; 

class StringPalindrome {

 public static void checkPalindrome(String name){ 
     boolean palindrome = true;
       
    for(int i =0;i<name.length()/2;i++){
               
        if(name.charAt(i)!=name.charAt(name.length()-1-i)){
         palindrome = false ; 
         break;
        } 
             }
     if(palindrome){
         System.out.println(name + " "+ "is a Palindrome String"); 
     }else{
        System.out.println(name + " is not a Palindrome String"); 
     }
 }


    public static void main(String[] args){
         Scanner sc =  new Scanner(System.in); 
           System.out.println("Enter the String");
           String name = sc.next(); 
         checkPalindrome(name);

    }
}