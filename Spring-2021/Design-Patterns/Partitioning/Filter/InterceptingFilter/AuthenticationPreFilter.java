package InterceptingFilter;

public class AuthenticationPreFilter implements Filter {
   public boolean execute(DataObject request){
       if (request.hasProperty("User") && request.hasProperty("Pass")){
           //check credentials
           request.removeProperty("User");
           request.removeProperty("Pass");
           request.addProperty("Auhenticated", "Yes");
           return true;
       } else return false;
   }
}