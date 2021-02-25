package LogTranslator;

public class CostcoRecordFactory implements LogRecordFactoryIF{
    private enum types {
        SALE,
        RETURN
    }

    public CostcoRecordFactory(){
        System.out.println("Creating RecordeFactory for Costco");
    }

    @Override
    public LogRecordIF readNextRecord(String type){

        System.out.println("Reading next " + type + " record for Costco.");

        if(type.equals("sale")){
            return new SaleRecord();
        }else if (type.equals("return")){
            return new ReturnRecord();
        }else{
            return null;
        }
    }
}