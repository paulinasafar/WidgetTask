package com.company;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        int compare = Integer.compare(p1.getQuantity(), p2.getQuantity());

        if(compare == 1) return -1;
        else if (compare == -1) return 1;
        else return 0;
    }
}
