class Factorail { 

   static int FactorailMethod(int n ){
     if(n==1) return n;
       
      return n* FactorailMethod(n-1);
  }


    public static void main(String[] args){
        System.out.println( FactorailMethod(5) ); 
    }
} 