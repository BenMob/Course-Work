package LogTranslator;

interface LogRecordFactoryIF{
    public LogRecordIF readNextRecord(String type);
}