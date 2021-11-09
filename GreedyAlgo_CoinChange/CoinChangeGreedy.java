package GreedyAlgo_CoinChange;

public class CoinChangeGreedy{
    private int[] denom;
    private int[] coinlist;
    public void coinChange(int cost, int[] denom,int length){
        coinlist=new int[cost];
        int i=0;
        int position=length-1;
        while(cost>0){
            cost-=denom[position];
            coinlist[i]=denom[position];
            while(cost!=0 && cost<denom[position]) {
                position--;
            }
            i++;
        }
        System.out.println("Number of coins: "+i);
        System.out.println("Coins are: ");
        for (int j=0;j<i;j++){
            System.out.println(coinlist[j]);
        }

    }
    public static void main(String[] args) {
        CoinChangeGreedy cc=new CoinChangeGreedy();
        cc.denom=new int[]{1,5,15,20};
        int length=cc.denom.length;
        int amount=68;
        cc.coinChange(amount,cc.denom,length);
    }
}