package Abtract;

 abstract class Pin {
      public abstract void write ();
     public abstract void refill ();
}

class FounditionPen extends Pin  {
    public void changenib() {
        System.out.println("changing");

    }

    @Override
    public void write() {
        System.out.println("i can write");
    }

    @Override
    public void refill() {
        System.out.println("i can refill");

    }
}



public class Pen {
    public static void main(String[] args) {
        FounditionPen peno = new FounditionPen();
        peno.write();
    }
}
