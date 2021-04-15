package DoorSecurity;

public class ModelMController implements DoorControllerIF{

    ModelMController(){}

    @Override
    public void requesDoorOpen(String key){
        System.out.println("Opening ModelM door with key " + key);
    }
}