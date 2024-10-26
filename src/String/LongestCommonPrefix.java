package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str={"flower","flow","flight"};

        int plen=0;




        while (true){
            if (str[0].length()>plen){
                boolean isAllWell=true;
                String chars=str[0].substring(0,plen+1);

                for (int i=1;i<str.length;i++){
                    if (plen<str[i].length() && str[i].substring(0,plen+1).equals(chars)){
                        //do nothing
                    }
                    else {
                        isAllWell=false;
                        break;
                    }
                }

                if (isAllWell){
                    plen++;
                }
                else{
                    break;
                }
            }
            else {
                break;
            }
        }

        System.out.println(str[0].substring(0,plen));
    }
}
