public class CommandManager {

    public void executeCommand(String command) {

        System.out.println("Executing Command : " + command);
    }

    public void undoCommand() {

        System.out.println("Undo Last Command");
    }

    public void redoCommand() {

        System.out.println("Redo Last Command");
    }

    public void showHistory() {

        System.out.println("Displaying Command History");
    }
}