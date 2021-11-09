package DynamicProgramming_CoinChange;

public class CoinChangeDynamic {
    private int[] denom;
    private int length;
    private int[] value;
    public int makeChange(int amount){
        value=new int[amount+1];
        int i=1;
        value[0]=0;
        for (i=1;i<=amount;i++){
            int j=0;
            int temp=Integer.MAX_VALUE;
            while(j<length && i>=denom[j]){
                if(temp < value[i-denom[j]]){
                    j++;
                }
                else{
                    temp=value[i-denom[j]];
                    j++;
                }
                value[i]=temp+1;
            }
        }
        return value[amount];
    }
    public static void main(String[] args) {
        CoinChangeDynamic ccg=new CoinChangeDynamic();
        ccg.denom=new int[]{5,15,20,25};
        //assuming that we are giving the denominations in the ascending order..Other wise we should apply sorting algorithm for the given input
        ccg.length=ccg.denom.length;
        int amount = 68;
        System.out.println("Amount is : " +ccg.makeChange(amount));
    }
}
