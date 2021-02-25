package LogTranslator;

public class BestBuyRecordFactory implements LogRecordFactoryIF{

    public BestBuyRecordFactory(){
        System.out.println("Creating RecordeFactory for Best Buy");
    }

    @Override
    public LogRecordIF readNextRecord(String type){

        System.out.println("Reading next " + type + " record for BestBuy.");

        if(type.equals("sale")){
            return new SaleRecord();
        }else if (type.equals("return")){
            return new ReturnRecord();
        }else{
            return null;
        }
    }
}