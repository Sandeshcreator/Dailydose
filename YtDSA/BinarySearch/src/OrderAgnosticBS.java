public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {20, 40, 60, 80, 99};

        int key = 20;

        System.out.println(Osearch(arr , key));
    }

    public static int Osearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean chck = (arr[start] < arr[end]);// for ascending checking true or not

        while (start<=end){
            int mid = (start+end)/2;

            if (chck){
                if ( arr[mid]>key) {
                    end =mid-1;
                } else if (arr[mid]<key) {
                    start=mid+1;

                }else {
                    return mid;
                }

            }else {
                if ( arr[mid]>key) {
                    start=mid+1;
                } else if (arr[mid]<key) {
                    end =mid-1;

                }else {
                    return mid;
                }

            }

        }
        return -1;


    }

}
