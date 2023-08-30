import java.util.Arrays;

public class Searchin2DArr {
    public static void main(String[] args) {
        int [][] arr ={
                {33,23,45,56} ,
                { 3,3,4,6}
        };
    int target = 3;

    int[] ress= Searchnum(arr,target);
        System.out.println(Arrays.toString(ress));
    }
     static int[] Searchnum(int[][] arr, int target){

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }


            }

        }


        return new int[]{-1,-1};
    }


}
