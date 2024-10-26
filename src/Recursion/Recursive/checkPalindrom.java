package Recursion.Recursive;

public class checkPalindrom {
    public static void main(String[] args) {

        String str="NAlopAN";

        isPalindrom(str,0,str.length()-1);

    }

    private static void isPalindrom(String str, int i, int j) {
        if (i>=j){
            System.out.println(true);
            return;
        }
        if (str.charAt(i)!=str.charAt(j)){
            System.out.println(false);
            return;
        }
        isPalindrom(str,i+1,j-1);
    }
}
