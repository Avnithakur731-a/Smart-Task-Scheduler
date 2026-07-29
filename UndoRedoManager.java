import java.util.Stack;

public class UndoRedoManager {

    private Stack<String> undoStack;
    private Stack<String> redoStack;


    public UndoRedoManager(){

        undoStack = new Stack<>();
        redoStack = new Stack<>();

    }


    // Save action
    public void addAction(String action){

        undoStack.push(action);

        // new action ke baad redo clear
        redoStack.clear();

        System.out.println("Action saved: " + action);
    }



    // Undo operation
    public void undo(){

        if(undoStack.isEmpty()){

            System.out.println("Nothing to undo");
            return;

        }


        String action = undoStack.pop();

        redoStack.push(action);

        System.out.println("Undo: " + action);

    }



    // Redo operation
    public void redo(){

        if(redoStack.isEmpty()){

            System.out.println("Nothing to redo");
            return;

        }


        String action = redoStack.pop();

        undoStack.push(action);

        System.out.println("Redo: " + action);

    }



    // Show history
    public void showHistory(){

        System.out.println("Undo History:");

        for(String action : undoStack){

            System.out.println(action);

        }

    }



    public int getUndoSize(){

        return undoStack.size();

    }


    public int getRedoSize(){

        return redoStack.size();

    }

}