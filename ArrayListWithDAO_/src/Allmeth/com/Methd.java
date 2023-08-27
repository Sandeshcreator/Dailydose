package Allmeth.com;


import Product.com.Product;
import java.util.List;

public interface Methd {

    String insert( Product prod);
    List<Product> getAll();
    String getById(int id);
    int delete(int id);


}