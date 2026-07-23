class Student {
    String name ;
    int rollNumber ;
     int marks[] = new int[1];
    Student(){
        System.out.println("Non Paratimised constructor");
    }


    Student( Student s1){
         this.name =  s1.name;
         this.rollNumber = s1.rollNumber;
         this.marks = s1.marks;
    }
}

class CopyConst {
    public static void main(String[] args ){
        Student s1 = new Student(); 

           s1.name = "devang";
           s1.rollNumber = 25250; 
           s1.marks[0]  = 50;
         Student s2 = new Student(s1);
          s1.name = "bhai";
          s1.marks[0] = 100;

        

         System.out.println("S1 name" + s1.name);

                  System.out.println("S2 name" + s2.name);

                System.out.println("S1 mark" + s1.marks[0]);

                           System.out.println("S2 mark" + s2.marks[0]);




    }
}