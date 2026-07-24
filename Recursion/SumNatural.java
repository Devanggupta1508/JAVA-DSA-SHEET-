public class SumNatural {
      public static int SumNatural(int n){

             int sum = 0;

            if(n==1){
                  
                  return 1;
            }  

      

            return  n+SumNatural(n-1);

       
      }  

      public static void main(String[] args){
          System.out.println( SumNatural(4));
      }
}
