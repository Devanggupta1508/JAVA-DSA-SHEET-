public class CheckSortedArray {
     
    static boolean Sort(int[]arr , int i){
         
        if(i == arr.length-1){
        return true;
        } 

          if(arr[i] >arr[i+1]){
            return false;
          }

          return Sort(arr,i+1);
    }

    public static void main(String[] args){
         int[] arr = {10,20,90,40,50};
         System.out.println(Sort(arr,0));
    }


}
