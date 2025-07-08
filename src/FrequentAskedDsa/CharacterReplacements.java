package FrequentAskedDsa;

public class CharacterReplacements {

    class Solution {
        public int characterReplacement(String s, int k) {

            int[] freq=new int[26];
            int maxWindows=0;
            int left=0;
            int max=0;

            for(int i=0;i<s.length();i++){

                freq[s.charAt(i)-'A']++;

                max=Math.max(max,freq[s.charAt(i)-'A']);

                int windowsLength=i-left+1;

                if(windowsLength-max>k){
                    freq[s.charAt(left)-'A']--;
                    left++;
                }
                windowsLength=i-left+1;
                maxWindows=Math.max(windowsLength,maxWindows);


            }
            return maxWindows;

        }
    }
}
