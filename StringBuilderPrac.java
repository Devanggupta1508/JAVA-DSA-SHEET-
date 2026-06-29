public class StringBuilderPrac {
    public static void main(String[] arg){
         StringBuilder str = new StringBuilder("devang");
         System.out.println(str);
         str.append("Gupta");
         System.out.println("Append Method " + str);
          
         str.insert(0,"Mr");

str.delete(0,2);
  System.out.println("delete method = " + str);

    }
}
