public class Main {
    static void main() {
        TextEditor editor = new TextEditor();
        EditorApp app = new EditorApp();

        Command head = new InsertCommand(editor, "=HEADER= Hello", 0);
        Command newline = new InsertCommand(editor, " \n ", 14);
        Command footer = new InsertCommand(editor, "=Footer= World!", 16);

        app.queueCommand(head);
        app.queueCommand(newline);
        app.queueCommand(footer);

        app.executeCommands();

        System.out.println(editor.getText());

        app.undoCommand();

        System.out.println("Blank" + editor.getText());

    }
}
