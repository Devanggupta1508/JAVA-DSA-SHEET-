public class MaxSubArr {
    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i =0; i<=arr.length;i++){

            int start = i;

            for(int j=i+1;j<=arr.length;j++){

                int end = j;
                currSum = 0; 

                for(int k = start;k<end;k++){
                      currSum += arr[k];
                }
                System.out.println(currSum);

                if(maxSum < currSum){
                    maxSum = currSum;
                }
                 
             }

             System.out.println(" ");
        }
        System.out.println("Max Sum  " + maxSum);
    }
}
