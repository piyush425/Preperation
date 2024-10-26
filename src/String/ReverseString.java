package String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "a good   example";

        String[] str=s.trim().split("\\s+");

        String finalStr="";

        for (int i=str.length-1;i>=0;i--){
            if(i==0){
                finalStr+=str[i].trim();
            }
            else{
                finalStr+=str[i].trim()+" ";
            }

        }
        System.out.println(finalStr);
    }
}
