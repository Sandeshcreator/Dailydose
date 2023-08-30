import java.util.Scanner;

public class CheckExist_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {2, 34, 56, 78, 89};
        for (int i : a) {
            if (i == sc.nextInt()) {
                System.out.println("number enterd is matched ");

            }
        }
    }
}
