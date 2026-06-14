abstract class Animal {
    abstract public void sound();
    public void live(){
        System.out.println("liveing being");
    }
}

class Cat extends Animal {
      public void sound(){
        System.out.println("memow");
         live();
      }
}

class Dog extends Animal {
      public void sound(){
        System.out.println("bark");
      }
}

public class Test {

    public static void main(String[] args){
         Cat s1 = new Cat();
         Dog s2 = new Dog(); 

         s1.sound();
         s2.sound();
    }
}
