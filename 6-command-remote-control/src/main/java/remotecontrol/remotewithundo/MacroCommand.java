package remotecontrol.remotewithundo;

public class MacroCommand implements Command {

    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    public void undo() {
        for(Command command : commands) {
            command.undo();
        }
    }
}
