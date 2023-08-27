package List.Db.com;

import Allmeth.com.Methd;
import Product.com.Product;

import java.util.ArrayList;
import java.util.List;

public class Datab implements Methd {


    private List<Product> prodDat = new ArrayList<>();


    @Override
    public String insert(Product prod) {
        prodDat.add(prod);

        return ("inserted successfully");
    }

    @Override
    public List<Product> getAll() {
        return prodDat;
    }

    @Override
    public String getById(int id) {
        for (Product p : prodDat) {
            if (id == (p.getId())) {
                return (p.toString());
            }

        }
        return null;


    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
