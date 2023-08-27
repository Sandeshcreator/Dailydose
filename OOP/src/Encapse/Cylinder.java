package Encapse;

public class Cylinder {
   public final double pie =3.141;

    public int radius;
    public int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double Surarea() {

        return (2*pie*radius*height+2*pie*radius*radius);
    }



    public double volume() {

        return (pie*radius*radius*height);
    }
}
