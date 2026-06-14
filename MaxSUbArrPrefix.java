 class prefix {

    public static void prefixMethod(int[] arr)
    {
        int[] prefixArray = new int [arr.length];
          int currSum = 0;
          int maxSum = Integer.MIN_VALUE;

          prefixArray[0] = arr[0]; 

        //   calculate prefix array 
        for(int i =1;i<arr.length;i++){
            prefixArray[i] = prefixArray[i-1] + arr[i];
        }

       for(int i =0;i<arr.length;i++){ 
           int start = i;
         
              for(int j=i;j<arr.length;j++){
                int end = j;
               if(start == 0){
             currSum = prefixArray[start];
                                      }
        else{
         currSum = prefixArray[end] - prefixArray[start-1];
          }
                   if(maxSum<currSum){
                    maxSum = currSum;
                   }
             
              }

        } 
        System.out.println("max Sum = " + maxSum);

    }
}

public class MaxSUbArrPrefix {
    public static void main(String[] args){
        int[] arr = {1,-2,6,-1,3};
          prefix.prefixMethod(arr);
    }
    
}
