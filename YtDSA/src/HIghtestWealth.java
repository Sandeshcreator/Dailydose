public class HIghtestWealth {
    public static void main(String[] args) {
      int [][]  accounts = {{1,5},{7,3},{3,5}};
      int high =maximumWealth(accounts);
        System.out.println(high);
    }

    public static int maximumWealth(int[][] accounts) {
        int[] result = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int total1 = 0; // Reset the total for each customer

            for (int j = 0; j < accounts[i].length; j++) {
                total1 += accounts[i][j];
            }

            result[i] = total1;
        }

        int maxc = result[0];
        for (int max = 1; max < result.length; max++) {
            if (result[max] > maxc) {
                maxc = result[max];
            }
        }

        return maxc;
    }


    }
