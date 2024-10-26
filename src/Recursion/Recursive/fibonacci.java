package Recursion.Recursive;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    // int n=5
    // 1 1 2 3 5
    public static void main(String[] args) {

        int n=6;
        int sum=0;
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(0); // Fill the list with 0s or any placeholder value
        }

        int s=fibonacciSeries(res,n-1,sum);
        System.out.println(s);

        for (Integer sr:res){
            System.out.println(sr);
        }

    }

    private static Integer fibonacciSeries(List<Integer> res, int n, int sum) {

        if(n==0){
            res.set(0,0);
            return 0;
        }
        if(n==1){
            res.set(1,1);
            return 1;
        }

        int s=fibonacciSeries(res,n-1, sum)+fibonacciSeries(res,n-2, sum);
        res.set(n,s);
        return s;
    }

}
