public class TargetSearch{
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int key = 0;

        System.out.println(Bsearch(arr , key));

    }

    public static  int Bsearch(int[] arr ,int key){
        int start =0;
        int end= arr.length-1;

        while (start<=end){

            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
            int mid = (start+end)/2;

            if (arr[mid]> key) {
                end= mid-1;
            } else if (arr[mid]< key) {
                start= mid+1;
            }else {
                return mid;
            }


        }
        return -1;

    }







}
