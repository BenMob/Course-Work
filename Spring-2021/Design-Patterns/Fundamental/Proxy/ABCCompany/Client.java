package ABCCompany;

import java.util.ArrayList;
import java.util.List;

public class Client{

    public static void test(){
        List<Product> items = new ArrayList<Product>();
        items.add(new Product(1, "Books", 5.99));
        items.add(new Product(2, "Bags", 2.99));
        items.add(new Product(3, "Buttons", 2.99));

        SortingIF listSorter = new SortingUtilityProxy();
        items = listSorter.sort(items, 1);  // QuickSort
        items = listSorter.sort(items, 2);  // BubbleSort
    }

    public static void main(String[] args){
        test();
    }
}