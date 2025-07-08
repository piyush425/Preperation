//priorityqueue
//linkedlist vs arraylist

import java8.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Need {



    public static void main(String[] args) {

        String strs="ababa";

        int start=0;
        int end=0;

        for (int i=0;i<strs.length();i++){

            int lenA=checkFromCenter(strs,i,i);
            int lenB=checkFromCenter(strs,i,i+1);

            int len=Math.max(lenA,lenB);

            if (len>end-start+1){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        System.out.println(strs.substring(start,end+1));









//        List<String> immutableList = Collections.unmodifiableList(
//                Stream.of("A", "B", "C")
//                        .collect(Collectors.toList())
//        );



        String str1 = "gdhabcuyabcod";
        String str = "abc";

        int count = 0;
        int index = 0;



        while ((index = str1.indexOf(str, index)) != -1) {
            System.out.println(str1.indexOf(str, index));
            count++;
            index += str.length(); // move forward to avoid overlapping
        }

        System.out.println("Count: " + count);



//        int[] count1={1,1,1,0,1};
//        System.out.println(Arrays.toString(count1));
//
//        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((a,b)->b[0]-a[0]);
//
//        priorityQueue.offer(new int[]{4,9});
//        priorityQueue.offer(new int[]{8,9});
//        priorityQueue.offer(new int[]{5,9});
//
//        System.out.println(priorityQueue.poll()[0]);
//        System.out.println(priorityQueue.poll()[0]);
//
//        String s="AAABABB";
//        HashMap<Character, Integer> count = new HashMap<>();
//        int res = 0;
//        int k=1;
//
//        int l = 0, maxf = 0;
//        for (int r = 0; r < s.length(); r++) {
//            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
//            maxf = Math.max(maxf, count.get(s.charAt(r)));
//
//            while ((r - l + 1) - maxf > k) {
//                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
//                l++;
//            }
//            res = Math.max(res, r - l + 1);
//        }
//
//       System.out.println(res);
//
//
//
//
//
//
//





//        int max=0;
//        int res=0;
//        for (int i=0;i<str.length();i++){
//            Map<Character,Integer> map=new HashMap<>();
//            for(int j=i;j<str.length();j++){
//                map.put(str.charAt(j), map.getOrDefault(str.charAt(j),0)+1);
//                max=Math.max(max,j-i+1);
//                if((j-i+1)-max<=k){
//                    res=Math.max(res,j-i+1);
//                }
//            }
//        }
//            System.out.println(res);


    }

    private static int checkFromCenter(String str, int i, int j) {
        while (i>0 && j<str.length() && str.charAt(i)==str.charAt(j)){
            i--;
            j++;
        }
        return j-i+1;
    }
}