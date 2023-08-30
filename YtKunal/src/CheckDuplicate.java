public class CheckDuplicate {
    public static void main(String[] args) {

        int [] nums = {1, 5, 2,5,8,40,8,8,8};
        int a=0;
        for (int i = 0; i <nums.length ; i++) {

            for (int j = 0; j <nums.length ; j++) {

              if (nums[i]==nums[j]) {
                  a=nums[i];

                }

            }

        }
        System.out.println("repated is " +a);


    }
}


