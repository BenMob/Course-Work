package InterceptingFilter;

public class LoggingPreFilter implements Filter {
   public boolean execute(DataObject request){
       if (request.hasProperty("Content")){
           System.out.println("Logger: Request Object:\n"+request);
       }
       return true;
   }
}