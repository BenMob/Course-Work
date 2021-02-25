package LogTranslator;

public class Client{
    private static void test(){
        LogRecordFactoryIF recordFactory = LogRecordFactory.createRecordFactoryObject("walmart");
        LogRecordIF saleRecord = recordFactory.readNextRecord("sale");
        saleRecord.getPOS();
        saleRecord.getTransactionTime();

    }


    public static void main(String[] args){
        test();
    }
}