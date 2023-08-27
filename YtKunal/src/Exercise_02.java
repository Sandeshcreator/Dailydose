import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Write a program to print whether a number is even or odd, also take input from the user.

       /* int a = sc.nextInt();

        if (a%2==0) {
            System.out.println("even");

        }else {
            System.out.println("odd");
        }
        */

        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        /*
        int princ = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        int simintr = (princ * time * rate) / 100;
        System.out.println(simintr);
        */

        //Input currency in USD and output in rupee.
   /*
        float usd = sc.nextFloat();
        float neplaitorup = 132.87f;
        float rupee = usd * neplaitorup;
        System.out.println(rupee);
        */

        //To find out whether the given String is Palindrome or not.

        /*
        String str = sc.next();
        String rev = "";
        for (int i =str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        */


        // To find Armstrong Number between two given number.
        /*
        int ser= sc.nextInt();
        int temp= ser;
        int res=0;
        while(ser>0){
            int digit  = ser%10;
            res= res+(digit *digit *digit);
            ser=ser/10;
        }



        if (res==temp){
            System.out.print( "arm ");

        }else{
            System.out.print( "not  ");
        }
        */


        //To calculate Fibonacci Series up to n numbers.
        /*
        int ser = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= ser; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        */



    }
}
