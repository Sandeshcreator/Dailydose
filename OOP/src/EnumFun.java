//enum watch{
//    SECOND, MINUTE,HOUR,ALARM
//}

public class EnumFun {
    enum Stickynotesize{
        Small, Medium,large;
    }
    public static void main(String[] args) {


        Stickynotesize size= Stickynotesize.Small;
        switch (size) {
            case Small:
                System.out.println("sec+1");

                break;

            case Medium:
                System.out.println("min+1");

                break;
            case large:
                System.out.println("hour+1");

                break;
            default:
                System.out.println("defactive piece");

                break;
        }



    }
}
