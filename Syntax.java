class Student {
    static   String schoolName  = "WCTM";      // static variable
         int age ;              // instance varibale
    
         void func(){
            int fee = 10; // local variable 
         }
}

class Syntax {
public static void main(String[] args){
    
    Student obj1 = new Student();
     obj1.age = 20;

     System.out.println(obj1.age);
          System.out.println(obj1.schoolName);
          

       
     
}
}