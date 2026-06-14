public class PairArray {
    public static void main(String[] args){
      int[] arr =  {2,4,6,8,10};
      int totalSubArray = 0;

        for(int i = 0;i<arr.length;i++){

             int startIndex = i;

            for(int j=i;j<arr.length;j++){

                int endIndex= j;

                for(int k = startIndex ;k<=endIndex;k++){
          System.out.print(arr[k] + " ");


                }
                System.out.println();

               totalSubArray++;
            }
            System.out.println("");
        }
        System.out.println(totalSubArray);
        System.out.println(arr.length * (arr.length+1)/2);
    }}
