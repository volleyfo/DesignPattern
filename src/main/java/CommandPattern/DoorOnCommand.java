package CommandPattern;

public class DoorOnCommand implements Command{
    private Door door ;

    public DoorOnCommand( Door door)
    {
        this.door = door;
    }

    public void execute()
    {
        door.on();
    }
}
