package ABCCompany;

import java.util.List;

public class SortingUtilityProxy implements SortingIF {

    SortingUtilityProxy(){};

    private void logFromQuickSort(List<Product> items){
        if(items != null){
            for(Product item: items){
                System.out.println(item.getName() + "\t" + item.getId() + "\t" + item.getPrice());
            }
            System.out.println();
        }
    }

    private void logFromBubbleSort(List<Product> items){
        if(items != null){
            for(Product item: items){
                System.out.println(item.getId() + "\t" + item.getName() + "\t" + item.getPrice());
            }
            System.out.println();
        }
    }

    private void log(List<Product> items, int sortingApproach){
        switch (sortingApproach){
            case 1:
                this.logFromQuickSort(items);
                break;
            case 2:
                this.logFromBubbleSort(items);
                break;
            default:
                break;
        }
    }

    @Override
    public List<Product> sort(List<Product> items, int sortingApproach) {
       List<Product> sortedItems = new SortingUtility().sort(items, sortingApproach);
       log(items, sortingApproach);     // Logs to the console.
       return sortedItems;
    }
}