package Array;

import java.util.Arrays;

public class richestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }
    public static int maximumWealth(int[][] accounts){
        int maxWealth = 0;
        for(int i=0; i< accounts.length; i++){
            int wealth =0;
            for(int j=0; j< accounts[i].length; j++){
                wealth += accounts[i][j];
            }
            if(wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
