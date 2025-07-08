package FrequentAskedDsa;

public class CoinChange {
    public static void main(String[] args) {

    }


    public int coinChangeMethod(int[] coins, int amount) {
        int[] minAmountCount=new int[amount+1];

        for(int i=1;i<amount+1;i++){
            minAmountCount[i]=Integer.MAX_VALUE;

            for(int coin:coins){
                if(coin<=i && minAmountCount[i-coin]!=Integer.MAX_VALUE){
                    minAmountCount[i]=Math.min(minAmountCount[i],minAmountCount[i-coin]+1);
                }
            }
        }
        if(minAmountCount[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return minAmountCount[amount];

    }
}

