public class Swapnum {
    public static void main(String[] args) {
        int a=10;
        int b=50;
        swapp(a,b);
    }

    public static void swapp(int a,int b){
        int temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println("value a is :"+a+"value b is :"+b );

    }

}
