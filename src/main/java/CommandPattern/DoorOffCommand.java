package CommandPattern;

public class DoorOffCommand implements Command{
    private Door door ;

    public DoorOffCommand( Door door )
    {
        this.door = door;
    }

    public void execute()
    {
        door.off();
    }
}
