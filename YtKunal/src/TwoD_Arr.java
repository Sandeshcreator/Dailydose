import java.lang.reflect.Array;

public class TwoD_Arr {
    public static void main(String[] args) {
        int [][] numb =  { {1, 2, 3, 4}, {5, 6, 7}, {5, 9, 7} };

            int total1 = 0;
            int[] result = new int[numb.length];
        for (int i = 0; i < numb.length ; i++) {

            for (int j = 0; j <numb[i].length ; j++) {
                total1+= numb[i][j];
            }
            result[i]= total1;
            System.out.println(result[i]);
        }

        int maxc= result[0];
        for (int i = 0; i < numb.length ; i++) {

            if (result[i]>maxc) {
                maxc= result[i];

            }
        }

        System.out.println(maxc);
        






//
//        int [] dumb= {9,10};
//        int total=0;
//        for (int i = 0; i <dumb.length ; i++) {
//            total+= dumb[i];
//        }
//        System.out.println(total);



    }
}
