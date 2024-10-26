package String;

public class RomanToInteger {
    public static void main(String[] args) {
        String str="MCMXCIV";

        /**
         * I can be placed before V (5) and X (10) to make 4 and 9.
         * X can be placed before L (50) and C (100) to make 40 and 90.
         * C can be placed before D (500) and M (1000) to make 400 and 900.
         */

        System.out.println(494/1000);

        int i=0;
        int sum=0;

        while (i<str.length()){

            if ((str.charAt(i) == 'M')){
                sum+=1000;
            }
            else if ((str.charAt(i)=='C') && i+1<str.length() && (str.charAt(i+1)=='M')){
                sum-=100;
            }
            else if ((str.charAt(i)=='X') && i+1<str.length() && (str.charAt(i+1)=='C')){
                sum-=10;
            }
            else if ((str.charAt(i)=='I') && i+1<str.length() && (str.charAt(i+1)=='V')){
                sum=sum-1;
            }
            else if ((str.charAt(i) == 'C')){
                sum+=100;
            }
            else if ((str.charAt(i) == 'D')){
                sum+=500;
            }
            else if ((str.charAt(i)=='X')){
                sum+=10;
            }
            else if ((str.charAt(i)=='V')){
                sum+=5;
            }
            else if ((str.charAt(i)=='I')){
                sum+=1;
            }
            i++;
        }
        System.out.println(sum);
    }
}
