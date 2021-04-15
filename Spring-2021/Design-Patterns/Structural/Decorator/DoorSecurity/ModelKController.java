package DoorSecurity;

public class ModelKController implements DoorControllerIF{

    ModelKController(){}

    @Override
    public void requesDoorOpen(String key){
        System.out.println("Opening ModelK door with key " + key);
    }
}