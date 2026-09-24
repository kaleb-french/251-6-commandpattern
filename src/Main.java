public class Main {
    static void main() {
        TextEditor editor = new TextEditor();
        InsertCommand command = new InsertCommand(editor, "Hello", 0);
        EditorApp app = new EditorApp();

        app.executeCommand(command);

        System.out.println(editor.getText());
    }
}
