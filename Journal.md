# Journal
Write your Journal questions and notes here.

Phase 1-
The editor app has no direct reference set in the EditorApp class, to the command, or to the text editor. The command is passed in at runtime, meaning this could be interchanged with anyother command with the command interface to make this part of your app very dynamic and easier to manage.

Phase 2-
Having the command object responsible for the logic makes the editor class simpler, because it doesn't need to know how to do the undo or execute it just tells the command object to do it and the command object takes care of the rest.

Phase 3-
A stack is resolved in a FILO order or First In Last Out. This is ideal for an undo history due to the fact the last action preformed would be the first to be retrieved from the stack. The queue retrieves them in the order they were placed in queue which in an undo pattern would give you the first action preformed not the last one. 

Phase 4-
The delete operation is much more permenant if state isn't captured. While the insert operation just needs the start and end point of the last text insert to undo, the delete command needs the entire text thats being deleted to restore.
