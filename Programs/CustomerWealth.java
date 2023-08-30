public class CustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int max = maximumWealth(accounts);
        System.out.println("Richest customer's wealth: " + max);
    }
    
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        
        return max;
    }
}
