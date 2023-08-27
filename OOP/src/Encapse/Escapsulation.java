package Encapse;

public class Escapsulation {
   private int price = 255;
    private String color;
    private String size;

//    public Escapsulation(String color, String size) {
//        this.color = color;
//        this.size = size;
//    }


    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
