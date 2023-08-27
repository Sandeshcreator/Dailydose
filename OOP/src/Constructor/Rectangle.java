package Constructor;

public class Rectangle {

    int length;
    int breadth;
    public Rectangle() {
        this.length=4;
        this.breadth=5;

    }
    public Rectangle(int length, int breadth) {
        this.length=length;
        this.breadth=breadth;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
