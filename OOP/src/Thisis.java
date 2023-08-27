public class Thisis {
    String color;
    String design;

    public Thisis(String color, String design){
        this.color = color;
        this.design=design;

    }




    public static void main(String[] args) {

        Thisis lovely= new Thisis("blue ","love");
        Thisis oldl= new Thisis("red ","girl");
        System.out.println(lovely.color);
        System.out.println(oldl.color);
    }


}
