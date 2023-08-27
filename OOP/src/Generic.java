

class   Trapezoid<T extends Number> {
    private T a;
    private T b;
    private T c;
    private T   h;

    public Trapezoid(T a, T b, T c, T h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }


    public double getArea() {
        double result = (a.doubleValue() + b.doubleValue()) * h.doubleValue() / 2.0;
        return result;
    }


 }



public class Generic {

    public static void main(String[] args) {
        Trapezoid<Integer> trapezoid = new Trapezoid<Integer>(1, 2, 3, 4);
        System.out.println(trapezoid.getArea());




    }
}
