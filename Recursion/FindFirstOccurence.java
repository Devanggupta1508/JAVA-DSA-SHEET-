class FindFirstOccurence {

         static void Find(int[] arr,int key ,int i){
           
            if(i==arr.length-1){
                System.out.println(key + "Not found");
                 return ;
            }


              if(arr[i] == key){
               System.out.println("Key found at index : " + i);
               return;
              }

                Find(arr,key,i+1);
         }









    public static void main(String[] args){
       int[] arr = {8,3,6,9,5,10,2,5,3};
         Find(arr,5,0);
    }
}