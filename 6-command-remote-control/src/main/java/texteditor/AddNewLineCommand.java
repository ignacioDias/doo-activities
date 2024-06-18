package texteditor;

public class AddNewLineCommand implements Command {
    private Buffer prevBuffer;
    private Buffer buffer;
    public AddNewLineCommand(Buffer buffer) {
        this.buffer = buffer;
    }
    public void execute() {
        prevBuffer = buffer;

        buffer.setBuffer(buffer.getBuffer());

    }
    public void undo() {
        
    }
    public void redo() {

    }
}
