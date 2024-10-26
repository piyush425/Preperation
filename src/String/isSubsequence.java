package String;

public class isSubsequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";

        int si=0;
        int ti=0;
        boolean res=false;

        while (si<s.length() && ti<t.length()){
            if(s.charAt(si)!=t.charAt(ti)){
                ti++;
            }
            else{
                si++;
                ti++;
            }
        }
        if (si==s.length()){
            res=true;
        }
        System.out.println(res);
    }
}
