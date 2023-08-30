public class HigherLower {
    public static void main(String[] args) {

        int n = 10;
        int result = guessNumber(n);
        System.out.println("The number that the player picked is: " + result);

    }
    public static int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = guess(mid);
            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static  int guess(int num) {
        int pick = 1; // This is the number that the player has picked
        if (num == pick) {
            return 0;
        } else if (num < pick) {
            return 1;
        } else {
            return -1;
        }
    }


}
