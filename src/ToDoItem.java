public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    // Add getters and setters for each field

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Setter for description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for isDone
    public boolean isDone() {
        return isDone;
    }

    // Setter for isDone
    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }
}