class Trapping {
    public static void TrappingMethod(int[] height,int width){
       int totalWaterTrapped = 0; 

       //check condition blocks must be grether than 2
        if(height.length<2){
           System.out.println(totalWaterTrapped);
         }else{

       //calcaulte the left max -  Array
       int[] leftMax = new int[height.length];


        leftMax[0] = height[0];
       for(int i=1;i<height.length;i++){
         leftMax[i] = Math.max(height[i],leftMax[i-1]);

       }

    //    calculate right max boundary - array 


       int[] rightMax = new int[height.length];

       rightMax[height.length-1] = height[height.length-1];

       for(int i=height.length-2; i>=0;i--){

     rightMax[i] = Math.max(height[i],rightMax[i+1]);
       } 

       // loop 
int trappedWater= 0; 
       for(int i=0;i<height.length;i++){
        //  check water level = min(leftmax[i],rightMax[i])

      int waterLevel = Math.min(leftMax[i],rightMax[i]);

      //trapped water 
        trappedWater = (waterLevel-height[i]) * width;
        //total water trapped;
        totalWaterTrapped += trappedWater; 
       }
       
           

       
    };
        System.out.println("Total water trapped = " + totalWaterTrapped);


        }}
         

public class TRAPPINGRAINWATER {
    public static void main(String[] args){
        int[] height = {4,2,0,6,3,2,5};
        int width = 1;
         Trapping.TrappingMethod(height,width);
    }
}
