public class InsertCommand implements Command{
    //a
    private TextEditor editor;
    private String text;
    private int position;
    //c
    public InsertCommand(TextEditor editor, String text, int position){
        this.editor = editor;
        this.text = text;
        this.position = position;
    }
    //m
    @Override
    public void execute(){
        editor.insert(text, position);
    }

	@Override
	public void undo() {
	    editor.remove(position, text.length());
	}
}
