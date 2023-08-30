public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {22, 23, 34, 56, 67, 76, 78, 54, 21, 12, 32};
        int target = 32;
      //  int result = LinearSh(arr, target);
       // System.out.println(result);
        int rs= Linearelementreturn(arr, target);
        System.out.println(rs);


    }

    public static int Linearelementreturn(int[] args, int target) {
        if (args.length == 0) {
            return -1;
        }
//        for (int res : args) {
//            if (target == res) {
//                return res;
//            }
//        }

        for (int elemn:  args ) {


            if (elemn == target) {
                return elemn;
            }
        }

        return -1;

    }

    public static int LinearSh(int[] args, int target) {
        if (args.length == 0) {
            return -1;
        }
//        for (int res : args) {
//            if (target == res) {
//                return res;
//            }
//        }

        for (int i = 0; i < args.length; i++) {

            int elemnt = args[i];
            if (elemnt == target) {
                return i;
            }
        }

        return -1;

    }

}