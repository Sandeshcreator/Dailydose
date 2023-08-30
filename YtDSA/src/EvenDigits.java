public class EvenDigits {

    public static void main(String[] args) {
     int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));


    }

    static int  findNumbers(int[] nums) {
        int count=0;
        for (int num:nums         ) {
            if (even(num)) {
                count++;


            }


        }
        return count;
    }

    private static boolean even(int num) {
        int numberofDigits= digits(num);
//        if (num %2==0) {
//            return true;
//        }
        return numberofDigits %2==0;
    }


    static int digits(int num) {
        int count=0;

        while (num>0){
            count++;
            num/=10;

        }
        return count;
    }

}
