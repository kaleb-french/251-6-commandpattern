import java.util.Stack;
public class EditorApp{
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
    }
    public void undoCommand(){
        if(!commandHistory.isEmpty()){
            Command command = commandHistory.pop();
            command.undo();
        }

    }
}
