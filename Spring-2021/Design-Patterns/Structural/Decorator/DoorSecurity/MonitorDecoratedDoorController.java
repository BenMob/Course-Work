package DoorSecurity;

public class MonitorDecoratedDoorController {
    DoorControllerIF decoratee;

    public MonitorDecoratedDoorController(DoorControllerIF decoratee){
        this.decoratee = decoratee;
    }

    @Override
    public void requesDoorOpen(String key){
        decoratee.requestDoorOpen();
    }
}