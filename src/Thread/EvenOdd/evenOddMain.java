package Thread.EvenOdd;

import java.util.Arrays;
import java.util.List;

public class evenOddMain {
    boolean isEven=false;
    private List<Integer> list;

    evenOddMain(List<Integer> list){
        this.list = list;
    }
    public void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,4,5,6,7,8);

        evenOddMain evenOddMain = new evenOddMain(list);

        Thread t1=new Thread(()->{

            for (Integer num:list){
                try {
                    if (num%2!=0){
                        System.out.println(num);
                    }
                    wait();
                    isEven=true;
//                    even.odd();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        });
        Thread t2=new Thread(()->{

            for (Integer num:list){
                try {
                    if (num%2==0){
                        System.out.println(num);
                    }
//                    even.even();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }

        });

        t1.start();
        t2.start();
    }
}
