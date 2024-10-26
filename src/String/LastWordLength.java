package String;

public class LastWordLength {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        String str=s.trim();
        int count=0;

        for(int i=str.length()-1;i>=0;i--){
            if((str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=97 && str.charAt(i)<=122))
            {
                count+=1;
            }
            else{
                break;
            }
        }
        System.out.println(count);


    }
}
