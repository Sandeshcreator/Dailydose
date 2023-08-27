package Abtract;

 class Monkey {
    public void jump(){

    }

    public void bite(){

    }
}

interface MyInterface {
    void eat();
    void sleep();
}

class Human extends monkey implements MyInterface{

    @Override
    public void eat() {
        System.out.println("eat mf");

    }



    @Override
    public void sleep() {

    }
}
public abstract class monkey {
    public static void main(String[] args) {
        Human man = new Human();
        man.eat();
    }



}

