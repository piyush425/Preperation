package String;

public class IntegerToRoman {
    public static void main(String[] args) {

        /**
         * I can be placed before V (5) and X (10) to make 4 and 9.
         * X can be placed before L (50) and C (100) to make 40 and 90.
         * C can be placed before D (500) and M (1000) to make 400 and 900.
         */
        int num=1;
        StringBuilder stringBuilder=new StringBuilder();

        processRomanNums(stringBuilder,"M","","",num/1000);
        num=num%1000;
        processRomanNums(stringBuilder,"C","D","M",num/100);
        num=num%100;
        processRomanNums(stringBuilder,"X","L","C",num/10);
        num=num%10;
        processRomanNums(stringBuilder,"I","V","X",num);

        System.out.println(stringBuilder);
    }

    private static void processRomanNums(StringBuilder stringBuilder, String minor, String middle, String higher, int num) {
        if(num<=3){
            for(int i=1;i<=num;i++){
                stringBuilder.append(minor);
            }
        }
        else if(num==4){
            stringBuilder.append(minor);
            stringBuilder.append(middle);
        }
        else if(num==5){
            stringBuilder.append(middle);
        }
        else if(num<=8){
            stringBuilder.append(middle);
            for(int i=6;i<=num;i++){
                stringBuilder.append(minor);

            }
        }
        else if(num<=8){
            stringBuilder.append(middle);
            for(int i=6;i<=num;i++){
                stringBuilder.append(minor);

            }
        } else if (num==9) {
            stringBuilder.append(minor);
            stringBuilder.append(higher);
        }

    }
}
