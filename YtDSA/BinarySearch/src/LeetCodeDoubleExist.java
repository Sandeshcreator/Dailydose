public class LeetCodeDoubleExist {
    public static void main(String[] args) {
      int[]  arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));

    }

    public static boolean checkIfExist(int[] arr) {
        int end= arr.length-1;
        for (int i = 0; i <end ; i++) {
            for (int j = 0; j < end; j++) {
                if (i!=j && arr[i] == 2 * arr[j]){
                    return true;
                }


            }

        }


        return false;
    }
}
