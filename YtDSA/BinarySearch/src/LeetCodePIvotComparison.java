public class LeetCodePIvotComparison {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] arr ,int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left<=right){
            int mid= (left+right)/2;
            if (target==arr[mid]){
                return mid;
            }
            else if (arr[mid]>=arr[left]){
                if (target<=arr[mid] && target>=arr[left]){
                    right =mid-1;
                }else{
                left=mid+1;
                }
            }
            else {
                if (target>=arr[mid] && target<=arr[right]){
                    left=mid+1;
                }else{
                    right =mid-1;
                }
            }
        }
        return -1;
    }


}
