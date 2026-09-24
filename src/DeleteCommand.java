public class DeleteCommand implements Command{
    //a
    private TextEditor editor;
    private int position;
    private int length;
    private String deletedText;
    //c
    public DeleteCommand(TextEditor editor, int position, int length) {
        this.editor = editor;
        this.position = position;
        this.length = length;
    }
    //m
    @Override
    public void execute() {
        deletedText = editor.getText().substring(position, position + length);

        editor.remove(position, length);
    }

    @Override
    public void undo() {
        editor.insert(deletedText, position);
    }
}
