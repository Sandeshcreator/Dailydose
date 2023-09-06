public class LeetCodeFirstLastPostion {
    public static void main(String[] args) {
       int [] nums = {5,7,7,8,8,10};
        int target = 8;

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int start= search(nums,target,true);
        int end= search(nums,target,false);

        ans[0]=start;
        ans[1]=end;




        return  ans;
    }


    int search(int[] nums, int target, boolean FindStartIndex) {

        int start = 0;
        int end = nums.length - 1;

        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (FindStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }


        return ans;
    }


}
