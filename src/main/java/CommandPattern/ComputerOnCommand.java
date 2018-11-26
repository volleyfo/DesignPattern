package CommandPattern;

public class ComputerOnCommand implements Command
{
    private Computer computer ;

    public ComputerOnCommand( Computer computer)
    {
        this.computer = computer;
    }

    public void execute()
    {
        computer.on();
    }

}
