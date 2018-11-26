package CommandPattern;

public class ComputerOffCommand implements Command
{
    private Computer computer ;

    public ComputerOffCommand( Computer computer)
    {
        this.computer = computer;
    }

    public void execute()
    {
        computer.off();
    }

}