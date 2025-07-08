package FrequentAskedDsa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set=new HashSet<>(wordDict);

        int maxlen=0;
        for(String str: wordDict){
            maxlen=Math.max(maxlen,str.length());
        }

        int n=s.length();

        boolean[] dp=new boolean[n+1];

        dp[0]=true;

        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=Math.max(0, i - maxlen);j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[dp.length-1];

    }
}
