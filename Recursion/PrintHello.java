public class PrintHello {
     
    static void PrintHello(int n){

        if(n==1){
            System.out.println(n + "Hello");
            return;
        }
        System.out.println(n + "Hello");
     PrintHello(n-1);
     return;
    } 
    public static void main(String[] args){
        PrintHello(5);
    }
}
