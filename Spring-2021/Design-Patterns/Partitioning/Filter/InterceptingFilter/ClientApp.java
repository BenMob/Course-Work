package InterceptingFilter;


import java.util.HashMap;

public class ClientApp {
   public static void main(String[] args) {
        UtilityCenter uc = new UtilityCenter();
        uc.configFilterChain();

        clientUsingFilteringService();
   }

   public static void clientUsingFilteringService(){
        HashMap<String, String> properties = new HashMap<>();
        properties.put("User", "TestUser");
        properties.put("Pass", "TestPass");
        properties.put("Content", "TestContent");
        DataObject d = new DataObject(properties);
      
        System.out.println("After being processe by filters:");
        UtilityCenter.getFilteringProvider().runFiltering(d);
        System.out.println(d);
   }
}