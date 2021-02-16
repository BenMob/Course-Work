package ABCCompany;

import java.util.List;

public class SortingUtility implements SortingIF{

    public SortingUtility(){}

    private void quickSort(List<Product> items){

        // Implement QuickSort by id
    }

    private void bubbleSort(List<Product> items){
        // Implement BubbleSort by id
    }

    @Override
    public List<Product> sort(List<Product> items, int sortingApproach){
        switch (sortingApproach){
            case 1:
                this.quickSort(items);
                break;
            case 2:
                this.bubbleSort(items);
                break;
            default:
                return items;
        }
        return items;
    }
}