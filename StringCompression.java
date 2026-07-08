public class StringCompression {

    public static void compressionMethod(String str){

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int count = 1;

            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)){
                count++;
                i++;
            }

            newString.append(ch);

            if(count > 1){
                newString.append(count);
            }
        }

        System.out.println(newString);
    }

    public static void main(String[] args){
        String str = "aaabbbccc";
        compressionMethod(str);
    }
}