import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;


public class Database {

    public static void registerUser(String username){
        JSONObject user = new JSONObject();
        JSONObject db = new JSONObject();
        JSONArray usersList = Database.getUsers();


        user.put("userName", username);
        user.put("gamesPlayed", 0);
        usersList.add(user);
        db.put("users", usersList);

        try(FileWriter file = new FileWriter("users.json")){
            file.write(db.toJSONString());
            file.flush();
        }catch (Exception e){
           e.printStackTrace();
        }

        System.out.println("Saved Successfully");
    }

    public static JSONArray getUsers(){
        JSONArray allUsers = null;
        JSONParser parser = new JSONParser();

        try(FileReader reader = new FileReader("users.json")){
           JSONObject results = (JSONObject)parser.parse(reader);
            allUsers = (JSONArray) results.get("users");
        }catch (Exception e){
            e.printStackTrace();
        }

        return allUsers;
    }


}
