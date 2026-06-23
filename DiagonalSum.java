class DiagonalSum {
    public static void DiagonalSumArray(int[][] arr){

        int sum=0;
        int n = arr.length;

          for(int i=0;i<n;i++){
            //primary diagonal 
             sum += arr[i][i];

             //left diagonal 

             sum += arr[i][n-1-i];
          }

          if(arr.length %2 != 0){
             
            sum -= arr[n/2][n/2];

          }

          System.out.println(sum);


    }


    public static void main(String[] args){
         int[][] arr = {
             {1,2,3},
             {4,5,6},
             {7,8,9}       
            };

        DiagonalSumArray(arr);
         }
    }
