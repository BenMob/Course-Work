import org.json.simple.JSONObject;

public class User extends JSONObject {

    private String userName;
    private int numberOfGames;

    public User(String userName){
        this.userName = userName;
        this.numberOfGames = 0;
    }

    public String getUserName() {
        return userName;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void incrementGames(){
        this.numberOfGames ++;
    }
}
