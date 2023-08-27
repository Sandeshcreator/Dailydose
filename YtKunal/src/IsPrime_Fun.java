import java.util.Scanner;

public class IsPrime_Fun {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b=sc.nextInt();
        boolean prme= Isprime(b);
        System.out.println(prme);

    }

    public static boolean Isprime(int a){
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
