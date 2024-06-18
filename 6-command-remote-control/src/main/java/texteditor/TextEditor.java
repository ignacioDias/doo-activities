package texteditor;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TextEditor {
    private List<Command> commands = new ArrayList<>();
    private Stack<Command> undo = new Stack<>();
    private Stack<Command> redo = new Stack<>();
    private Buffer buffer = new Buffer("");
    public TextEditor() { //TODO: preguntar, porque está "mal" usar "new" pero acá el ejercicio me da una secuencia específica de elementos
        commands.add(new AddNewLineCommand(buffer));
        commands.add(new RemoveLineCommand());
        commands.add(new PrintBufferCommand());
    }
    public void executeCommand(int command) {
        assert command >= 1 && command < 6;
        if(command == 4)
            undo();
        else if (command == 5)
            redo();
        else
            commands.get(command - 1).execute();
    }
    public void undo() {
        Command command = undo.pop();
        redo.push(command);
        command.undo();
    }
    public void redo() {
        Command command = redo.pop();
        undo.push(command);
        command.redo();
    }
}
