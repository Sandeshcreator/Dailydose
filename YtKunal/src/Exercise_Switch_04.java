import java.util.Scanner;

public class Exercise_Switch_04 {

    public static void lightnextprc(String nextprocess) {
        switch (nextprocess) {
            case "going" -> System.out.println("be ready for fine");
            case "stop" -> System.out.println("next light will come soon..");
        }

    }

    public static void main(String[] args) {


        //Traffic Light:
        Scanner sc = new Scanner(System.in);
        String light = sc.nextLine();

        switch (light) {
            case "red" -> {
                System.out.println("stop");
                System.out.println("Enter a process after red: ");

                lightnextprc(sc.nextLine());

            }
            case "yellow" -> System.out.println("start");
            case "green" -> System.out.println("race");
        }
        /*  String low= sc.nextLine();
        System.out.println(low.toLowerCase());
        */

    }

}
