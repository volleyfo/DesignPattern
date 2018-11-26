package CommandPattern;


public class QuickCommand implements Command
{
    private Command[] commands;

    public QuickCommand(Command[] commands)
    {
        this.commands = commands;
    }

    public void execute()
    {
        for (int i = 0; i < commands.length; i++)
        {
            commands[i].execute();
        }
    }

}