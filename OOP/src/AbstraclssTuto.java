abstract class Animal{
    public void leg(){
        System.out.println("4 legs");}

    abstract void sound();
        }

         class Tiger extends Animal {


             @Override
             void sound() {
                 System.out.println("i gurungung");
             }
         }



public class AbstraclssTuto {
    public static void main(String[] args) {

        Tiger tg = new Tiger();
        tg.sound();
        tg.leg();


 //       System.out.println("i have"+tg.leg()+"sound:"+tg.sound());



    }
}
