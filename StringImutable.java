public class StringImutable {
    public static void main(String[] args){
         
        String str = "devang";

        for(char chr = 'a'; chr<='z';chr++){
               str += chr; 
        }
        System.out.println(str);
    }
}
