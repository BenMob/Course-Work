package InterceptingFilter;

public class FilterManager implements FilteringProviderIF{
   FilterChain filterChain;

   public FilterManager(){
      filterChain = new FilterChain();
   }
   public void addFilter(Filter filter){
      filterChain.addFilter(filter);
   }

   @Override
   public void runFiltering(DataObject request){
      filterChain.execute(request);
   }
}