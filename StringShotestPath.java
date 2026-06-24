import java.util.Scanner ; 


public class StringShotestPath {
  public static void searchShortestPath (String path){
         path = path.toUpperCase();
      int y = 0;
      int x = 0;
 
        for(int i=0;i<path.length();i++){
                 
             char dir = path.charAt(i);

              if(dir == 'N'){
                     y++;
              }

              else if(dir =='S'){
                 y--;
              }
              else if(dir =='E'){
                 x ++; }

                 else if(dir == 'W'){
                     x--;
                 }
              }  

                
              System.out.println("Coordinates" + " " + x +" , " + y);  
   
              //forumala squareroot x square + y square 

               int x2 = x*x ;
               int y2 = y*y ; 
                
                double shortestCal = Math.sqrt(x2 + y2);
             System.out.println("Shortest path" + " "+ shortestCal );
        }

           
  





    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter the path");
           String path = sc.nextLine();

           searchShortestPath(path);
    }
    
}
