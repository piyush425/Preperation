public class longestPalindrome {
    public static void main(String[] args) {
        String str="ababa";

        int start=0;
        int end=0;

        for(int i=0;i<str.length();i++){
            int lenA=checkFromCentre(str,i,i);
            int lenB=checkFromCentre(str,i,i+1);

            int len=Math.max(lenA,lenB);

            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        System.out.println(str.substring(start,end+1));
    }

    private static int checkFromCentre(String str, int left, int right) {
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
