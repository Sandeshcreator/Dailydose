package Constructor;


import Encapse.Cylinder;

class stdetail{
        String name;
        int UoNid;
        String password;


    public stdetail(String name,int UoNid,String password){
        this.name =name;
        this.UoNid=UoNid;
        this.password=password;
        }
        }

public class Main {



    public static void main(String[] args) {

        stdetail stdd= new stdetail("sandy",5255,"sdkjchs");
        stdetail stdd2= new stdetail("sa",55,"s2j@hs");

        System.out.println(stdd2.name+stdd2.password+stdd2.UoNid);


        Clinder cc = new Clinder(25,52);

        System.out.println(cc.getHeight());


        Rectangle rgg = new Rectangle(25,25);
        System.out.println(rgg.getLength()* rgg.breadth);




    }
}
