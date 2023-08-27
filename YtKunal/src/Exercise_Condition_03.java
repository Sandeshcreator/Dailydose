import java.util.Scanner;

public class Exercise_Condition_03 {
    public static void main(String[] args) {
//        Calculate Electricity Bill.
//                Calculate Discount Of Product.
//                Calculate Commission Percentage.
//        Check Leap Year Or Not.
//
//                Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

//        Calculate Electricity Bill.
        Scanner sc = new Scanner(System.in);
          /*  System.out.println("Enter the number of units consumed:");
            int units = sc.nextInt();
            int bill = 0;

            if (units<=100){
                System.out.println("Its free ");
            }else {
                bill = units * 13;
                System.out.println(bill);
            }
            */

        //                Calculate Discount Of Product.
       /* System.out.println("Enter the total price u purchased:");
        double price = sc.nextDouble();
        double discount = 0;
        if (price > 50000) {
            discount = price * 0.2;
            System.out.println("Discount u got is " + (discount));
            System.out.println("Total after discount is " + (price - discount));

        } else if (price > 10000) {
            discount = price * 0.1;
            System.out.println("Discount u got is " + (discount));
            System.out.println("Total after discount is " + (price - discount));

        } else if (price > 5000) {
            discount = price * 0.05;
            System.out.println("Discount u got is " + (discount));
            System.out.println("Total after discount is " + (price - discount));
        } else {
            System.out.println("Discount u got is " + (discount));
            System.out.println("Total  is " + " " + price);
        }
        */

        //  Check Leap Year Or Not.
      /*  System.out.println("Enter a year:");
        int year= sc.nextInt();

        if ((year%4==0 && year% 100 !=0) || year/400==0 ) {
            System.out.println("it's a leap yor");

        }else {
            System.out.println("no its not ");
        }
        */
//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program
// to count the number of days he can go out in the month of August.
       /* System.out.println("Enter a month:");
        String month = sc.nextLine();
        int total=0;
        if (month.equals("jan")) {
            for (int i = 1; i <= 31; i++) {
                if (i%2==0) {
                    System.out.println("You are allowed on only " + i);
                    total = total + 1; // Counting the even days
                }


            }
            System.out.println("Total even days: " + total); // Display the total even days
            System.out.println("Total days: 31"); // Total days in January
        }else {
            System.out.println("nooooo");
        }
*/


    }
}
