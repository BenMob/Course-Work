package DoorSecurity;

public class ModelTController implements DoorControllerIF{

    ModelTController(){}

    @Override
    public void requesDoorOpen(String key){
        System.out.println("Opening ModeT door with key " + key);
    }
}