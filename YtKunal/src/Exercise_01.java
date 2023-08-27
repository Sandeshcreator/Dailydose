import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  Input a year and find whether it is a leap year or not.

      /*  System.out.print("Enter a year:");
        int year = sc.nextInt();
        if ((year%4==0 && year % 100!= 0) || (year % 400 == 0)) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
               */

        // Take two numbers and print the sum of both.

       /* int a= sc.nextInt();
        int b =sc.nextInt();
        System.out.println(a+b);
       */

        //Take a number as input and print the multiplication table for it.

       /*   int multi= sc.nextInt();

          for (int i=10; i>=1; i-- ){
              System.out.println(multi+"X"+i +"=" +multi*i);
          }
        */

      //  Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        int total = 0;


        while (true){
            int num = sc.nextInt();

            total+=num;

            try {
                if (num == 'X') {
                    System.out.println(total);
                    break;

                }

            }catch (Exception e){
                System.out.println(e);



            }
        }




    }
}
