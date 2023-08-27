import java.util.Scanner;

public class Exercise_Function_05 {
    static Scanner sc= new Scanner(System.in);
    public static int naturlad(int userin) {
        int result = 0;


        for (int i = 1; i <=userin; i++) {
            result = result+i;
       }
       return result;


    }
    public static void main(String[] args) {
    //Write a function that returns all prime numbers between two given numbers
        System.out.println("Ebter a numb");
        int res=naturlad(sc.nextInt());
        System.out.println(res);








    }
}
