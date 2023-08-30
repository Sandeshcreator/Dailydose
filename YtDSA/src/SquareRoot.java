public class SquareRoot {
    public static void main(String[] args) {
        int x=6;
        int  result= mySqrt( x);
        System.out.println(result);




    }

    public static int mySqrt(int x) {
        int result= (int) Math.sqrt(x);
        return result;
    }


}
