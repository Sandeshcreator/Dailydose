package Enterface;

public class InterfaceEx implements Shape {

    int length;
    int width;



    public InterfaceEx( int length,    int width){
        this.length= length;
        this.width= width;

    }
    @Override
    public double Area() {
        return length * width;
    }

    @Override
    public double Perimeter() {
        return length * width;
    }
}
