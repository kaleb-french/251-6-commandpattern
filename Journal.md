# Journal
Write your Journal questions and notes here.

Phase 1-
The editor app has no direct reference set in the EditorApp class, to the command, or to the text editor. The command is passed in at runtime, meaning this could be interchanged with anyother command with the command interface to make this part of your app very dynamic and easier to manage.

Phase 2-
Having the command object responsible for the logic makes the editor class simpler, because it doesn't need to know how to do the undo or execute it just tells the command object to do it and the command object takes care of the rest.
