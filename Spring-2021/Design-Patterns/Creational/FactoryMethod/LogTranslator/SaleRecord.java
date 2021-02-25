package LogTranslator;

public class SaleRecord implements LogRecordIF{
    public SaleRecord(){};

    @Override
    public void getPOS(){
        System.out.println("In SaleRecord \n----------------");
        System.out.println("POS: Sale Register 16");
    }

    @Override
    public void getTransactionTime(){
        System.out.println("In SaleRecord \n----------------");
        System.out.println("Trnasaction Time: 12:30pm");
    }
}