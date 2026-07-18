public class BinaryITHFunction {
 //get ith function
     public static int getITHbit(int n , int i){
         int max = 1<<i;
         if( (n&max)==0){
            return 0;
         }else{
            return 1;
         }
         
     } 
        //set ith function
     public static int setITHbit(int n , int i){
        int max = 1<<i;
         return n|max ;

     }
           // clear ith bit function 
     public static int clearITHbit(int n , int i){
         int max = 1<<i;
         return n&~(max) ;
     } 


              //update ith bit 
              public static int updateITHbit(int n , int i , int newbit){
               // step 1 :clear ith bit first then update
                    int max = 1<<i;
                    n = n&~(max);

                    //update the ith bit 

                    max = newbit << i;
                     n = n| max ; 
                     return n ;
              } 

             //clear last i bits 
             
             public static int clear_I_bit(int n,int i){ 
                int max = ~0 << i ;

              n = n & max ; 
              return n ;

             }
             // clear Range of bits 
          public static int clearRangeBit(int n , int i , int j){
                int a = (~0) <<(j+1);
                 int b = (1<<i)-1; 
                  int max = a|b ;
                    return max & n ; 

          }
      // check if a number is a power of 2 or not  

       public static boolean CheckPower2N(int n){
           
         return ( n &(n-1) ) == 0;
       }
         

       //Count set  bits in a Number 

       public static int CountSETBIT(int n){
           int count = 0; 
          
           while(n>0){
             if((n&1)==1){
               count++;
             }
             n = n>>1; 
           }
           return count;
       }
  // fast exponentitiation 

         public static int fastExpo(int a , int n){
             int ans = 1; 

             while(n>0){
                if((n&1)==1){
                  ans=ans*a ;
                }
                a=a*a; 
                n= n>>1;
             }
             return ans;
         }


     public static void main(String[] args){
       
       System.out.println( "Get ith "+ getITHbit( 10,2));

       System.out.println( "Set ith "+ setITHbit( 10,2));
     System.out.println( "clear ith "+ clearITHbit( 10,1));

     System.out.println("Update ith " + updateITHbit(10,2,1));

     System.out.println("Clear the i bit " + clear_I_bit( 15 ,  2));

     System.out.println ("Clear range of bits " +clearRangeBit( 10 ,2,4));

     System.out.println("Check if a number is a power of 2 or not ==  " + CheckPower2N(16)); 

     System.out.println("Count the set bit in a Number"+ CountSETBIT(10));

     System.out.println("expontentation : " + fastExpo(3,5));

     }   
}
