package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Mouse", 90.0));
        list.add(new Product("Mousepad", 45.0));
        list.add(new Product("Monitor", 400.0));

        double min = 100.0;

        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}