class Student {
    String name ;
 
    Student(){
        System.out.println("Object is created ........");
    }

     Student(String name){
         this();
         this.name = name;
         System.out.println(name);
         
     } 
}

class CONSTRUCTORJAVA {
    public static void main(String[] args){
         
        Student s1 = new Student("Devang");
          
    }
}