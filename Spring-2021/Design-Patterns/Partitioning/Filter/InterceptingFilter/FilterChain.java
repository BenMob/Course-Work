package InterceptingFilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
   private List<Filter> filters = new ArrayList<Filter>();

   public void addFilter(Filter filter){
      filters.add(filter);
   }

   public void execute(DataObject request){
       //chain of pre-processing
      for (Filter filter : filters) {
         if (!filter.execute(request)) break;
      }
   }

}