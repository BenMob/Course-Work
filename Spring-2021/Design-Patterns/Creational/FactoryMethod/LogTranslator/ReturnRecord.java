package LogTranslator;

public class ReturnRecord implements LogRecordIF{
    public ReturnRecord(){};

    @Override
    public void getPOS(){
        System.out.println("In ReturnRecord \n----------------");
        System.out.println("POS: Sale Register 32");
    }

    public void getTransactionTime(){
        System.out.println("In ReturnRecord \n----------------");
        System.out.println("Trnasaction Time: 10:30am");
    }
}