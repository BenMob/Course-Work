/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterceptingFilter;

import java.util.HashMap;

/**
 *
 * @author sfan
 */
public class DataObject {
    private HashMap<String, String> properties = new HashMap<>();
    public DataObject(HashMap<String, String> p){
        properties = p;
    }
    public void addProperty(String k, String v){
        properties.put(k, v);
        
    }
    public String getProperty(String k){
        return properties.get(k);
        
    }
    public boolean hasProperty(String k){
        return properties.containsKey(k);
        
    }
    public void removeProperty(String k){
        properties.remove(k);
        
    }
    public String toString(){
        String result = "";
        for (String key: properties.keySet()){
            result += key+": "+properties.get(key)+"\n";
        }
        return result;
    }
}
