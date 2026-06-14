class KadaneAlgo {
    public static void kadaneMethod(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
         

                currSum = currSum+arr[i];

                
                if(currSum>maxSum){
                    maxSum = currSum;
                }

                if(currSum<0){
                    currSum=0;
                }

        }
        System.out.println("Max Sum = " + maxSum);
    

    }


} 

public class MaxSubArrayKadane {
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        KadaneAlgo.kadaneMethod(arr);
    }
}
