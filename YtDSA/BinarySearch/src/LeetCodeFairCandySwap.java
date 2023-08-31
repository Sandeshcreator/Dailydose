import java.util.Arrays;

public class LeetCodeFairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1, 1};
        int[] bobSizes = {2, 2};
        int[] result = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(result)); // prints [1, 2]
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int aliceSize : aliceSizes) {
            aliceTotal += aliceSize;
        }
        for (int bobSize : bobSizes) {
            bobTotal += bobSize;
        }
        int diff = (bobTotal - aliceTotal) / 2;
        for (int aliceSize : aliceSizes) {
            for (int bobSize : bobSizes) {
                if (bobSize - aliceSize == diff) {
                    return new int[]{aliceSize, bobSize};
                }
            }
        }
        return new int[]{};
    }
}
