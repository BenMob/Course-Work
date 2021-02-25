package LogTranslator;

public class WalmartRecordFactory implements LogRecordFactoryIF{
    private enum types {
        SALE,
        RETURN
    }

    public WalmartRecordFactory(){
        System.out.println("Creating RecordeFactory for Walmart");
    }

    @Override
    public LogRecordIF readNextRecord(String type){

        System.out.println("Reading next " + type + " record for Walmart.");

        if(type.equals("sale")){
            return new SaleRecord();
        }else if (type.equals("return")){
            return new ReturnRecord();
        }else{
            return null;
        }
    }
}