package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

        String s="pwwkew";
        int i=0;
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int j=0;j<s.length();j++){
            char currectChar=s.charAt(j);

            if (map.containsKey(currectChar)){
                i=Math.max(i,map.get(currectChar)+1);
            }
            map.put(currectChar,j);
            max=Math.max(j-i+1,max);

        }
    }
}
