package ArrayList.ui.com;

import List.Db.com.Datab;
import ViewProd.ProductView;
import java.util.Scanner;

public class GraphicUser {
    public static void main(String[] args) {
        ProductView pv = new ProductView(new Scanner(System.in), new Datab());
        pv.controller();

    }


}
