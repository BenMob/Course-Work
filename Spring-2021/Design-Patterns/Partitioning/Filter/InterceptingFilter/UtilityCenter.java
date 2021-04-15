/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilter;

/**
 *
 * @author sfan
 */
public class UtilityCenter {
    private static FilterManager filterProvider = new FilterManager();
    
    public void configFilterChain(){
        filterProvider.addFilter(new LoggingPreFilter());
        filterProvider.addFilter(new AuthenticationPreFilter());
    }
    public static FilteringProviderIF getFilteringProvider() {
        return filterProvider;
    }
}
