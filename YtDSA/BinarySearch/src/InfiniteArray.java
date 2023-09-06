public class InfiniteArray {
//    Find position of an element in a sorted array of infinite numbers.
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 7;
        int start=0;
        int end=2;


        while (arr[end]<target) {
            int temp= end+1;

            end = end + (end  * 2);
            start=temp;

        }
        System.out.println(CeilingSeach(arr,target,start,end));

    }

    public static int CeilingSeach(int[] arr, int target,int start,int end) {



        while (start<=end){

            int mid = (start+end)/2;

            if (arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;


            }else {
                return mid;
            }
        }
        return -1;

    }
}
