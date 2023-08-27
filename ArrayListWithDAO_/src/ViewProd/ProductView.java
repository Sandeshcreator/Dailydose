package ViewProd;

import Product.com.Product;

import Allmeth.com.Methd;


import java.util.Scanner;

public class ProductView {

    private Scanner sc;
    private Methd producthiding;

    public ProductView(Scanner sc, Methd producthiding) {
        this.sc = sc;
        this.producthiding = producthiding;
    }
        public void menu() {
            System.out.println("1.Add Product");
            System.out.println("2.Show Product");
            System.out.println("3.Search Product");
            System.out.println("5.Delete Product");
            System.out.println("5.Exit");
        }
    public void addProduct() {

        Product prod = new Product();

        System.out.println("Enter the id of the product");
        prod.setId(sc.nextInt());
        System.out.println("Enter the name of the product");
        prod.setName(sc.next());
        System.out.println("Enter the description of the product");
        prod.setDescription(sc.next());
        System.out.println("Enter the price of the product");
        prod.setPrice(sc.nextDouble());
        producthiding.insert(prod);

    }

    public void Showall() {
        System.out.println("All the Product");
        for (Product p : producthiding.getAll()) {
            System.out.println(p.toString());
        }

    }

    public void search() {

        System.out.println("Enter the id of the product");
        int idd = sc.nextInt();
        System.out.println(producthiding.getById(idd));

    }

    public void delete() {

    }



    public void controller() {
        while (true) {
            menu();
            System.out.println("Enter the number you want");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                  addProduct();
                    break;
                case 2:
                    Showall();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
            System.out.println("wanna continue Y/N");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("N")) {
                System.out.println("you are going to exit....");
                System.exit(0);
            }

        }
    }


}
