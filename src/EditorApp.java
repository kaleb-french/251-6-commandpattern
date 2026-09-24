
public class EditorApp{
    private MacroCommand macro = new MacroCommand();

    public void queueCommand(Command command){
        macro.addCommand(command);
    }
    public void executeCommands(){
        macro.execute();
    }
    public void undoCommand(){
        macro.undo();
    }
}
