package Abtract;

abstract class Telephone {
     abstract void ring();
    abstract void lift();
    abstract void dissconect();
}

class Iphone extends Telephone{

    @Override
    void ring() {
        System.out.println("i am iphone ring");
    }

    @Override
    void lift() {
        System.out.println("i am heavy");

    }

    @Override
    void dissconect() {
        System.out.println("i am disconnect with charge");

    }
}


class SmartTelephone extends Telephone{

    @Override
    void ring() {
        System.out.println("i am android ring");
    }

    @Override
    void lift() {
        System.out.println("i am light weight");

    }

    @Override
    void dissconect() {
        System.out.println("i am with charge");

    }
}

public class ploymor{
    public static void main(String[] args) {
        Telephone smart = new SmartTelephone();
        smart.ring();

        Telephone iphonee = new Iphone();
        iphonee.ring();
    }

}

