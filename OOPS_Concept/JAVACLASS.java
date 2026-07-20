public class JAVACLASS {
public static void main(String[] args){
   PEN p1 = new PEN(); 
    p1.color = "red";
    p1.tip = 5;
    System.out.println(p1.color);

    p1.tip(10);
    System.out.println(p1.tip);
}
}

class PEN {
    String color ;
    int tip ;

          void color(String newColor){
              color = newColor; 
 }
    void tip(int newTip){
        tip = newTip; 
    }
   
}