package SlidingWindow;

import java.io.Console;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

        String s="pwwkewabcde";

        Set<Character> set=new HashSet<>();

        int start=0;
        int max=0;

        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            while (set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);

            max=Math.max(max,i-start+1);

        }
        System.out.println(max);
//        int i=0;
//        int max=0;
//        Map<Character,Integer> map=new HashMap<>();
//        for(int j=0;j<s.length();j++){
//            char currectChar=s.charAt(j);
//
//            if (map.containsKey(currectChar)){
//                i=Math.max(i,map.get(currectChar)+1);
//            }
//            map.put(currectChar,j);
//            max=Math.max(j-i+1,max);
//        }
    }
}
