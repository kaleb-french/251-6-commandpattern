public class Main {
    static void main() {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command command1 = new InsertCommand(editor, "Hello", 0);
        Command command2 = new InsertCommand(editor, " World", 5);
        Command command3 = new InsertCommand(editor, "!", 11);

        app.executeCommand(command1);
        System.out.println(editor.getText());
        app.executeCommand(command2);
        System.out.println(editor.getText());
        app.executeCommand(command3);
        System.out.println(editor.getText());

        Command delete = new DeleteCommand(editor, 6, 5);

        app.executeCommand(delete);
        System.out.println(editor.getText());

        app.undoCommand();
        System.out.println(editor.getText());
    }
}
