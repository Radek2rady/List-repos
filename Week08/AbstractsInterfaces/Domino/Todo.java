package AbstractsInterfaces.Domino;

public class Todo implements Printable {
    public String getTask() {
        return Task;
    }

    public String getPriority() {
        return Priority;
    }

    public boolean isDone() {
        return Done;
    }

    protected String Task;
    protected String Priority;
    protected boolean Done;

    public Todo() {
//        this.Task = "Buy milk";
//        this.Priority = "high";
//        this.Done = true;
    }

    public Todo(String Task, String Priority, boolean Done) {
        this.Task = Task;
        this.Priority = Priority;
        this.Done = Done;
    }

    @Override
    public void printAllFields() {
        System.out.println("Priority: " + this.getPriority() + ", Task: " + this.getTask() + ", Done: " + this.isDone());
    }
}
