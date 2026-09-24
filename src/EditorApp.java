public class EditorApp{

    public void executeCommand(Command command){
        command.execute();
    }
    public void undoCommand(Command command){
        command.undo();
    }
}
