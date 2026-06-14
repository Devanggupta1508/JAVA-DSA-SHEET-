import java.util.Arrays;


class reverseFunction {
 
public static void reverse(int number[]){
       
  for(int i =0;i<number.length/2;i++){

    int first = number[i];
    int last = number[number.length-1-i]; 


 

     
     number[i] = last ; 
     number[number.length-1-i] = first ;

  }
        
  System.out.println(Arrays.toString(number));
        
        
     }  


}






class reverseArray {
 
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50}; 
          reverseFunction.reverse(arr); 
    }
  

}