package LogTranslator;


public class LogRecordFactory {
    public LogRecordFactory(){}
    public static LogRecordFactoryIF createRecordFactoryObject(String type) {
        if (type.equals("costco")) {
            return new CostcoRecordFactory();
        } else if (type.equals("walmart")) {
            return new WalmartRecordFactory();
        } else if (type.equals("bestbuy")) {
            return new BestBuyRecordFactory();
        }else{
            return null;
        }
    }
}