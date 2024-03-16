package StackTaskManager;
import java.util.Stack;

public class TaskManager {
    private Stack<Task> taskStack;

    public TaskManager() {
        taskStack = new Stack<>();
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        taskStack.push(newTask);
        System.out.println("Task added: " + description);
    }

    public void markTaskAsCompleted() {
        if (!taskStack.isEmpty()) {
            Task task = taskStack.peek();
            task.markAsCompleted();
            System.out.println("Task completed: " + task.getDescription());
        } else {
            System.out.println("No tasks to mark as completed.");
        }
    }

    public void undoTaskCompletion() {
        if (!taskStack.isEmpty()) {
            Task task = taskStack.peek();
            if (task.isCompleted()) {
                task.undoCompletion();
                System.out.println("Undo completed for task: " + task.getDescription());
            } else {
                System.out.println("Task is not completed. Nothing to undo.");
            }
        } else {
            System.out.println("No tasks to undo completion.");
        }
    }

    public void displayTasks() {
        System.out.println("Task List:");
        for (Task task : taskStack) {
            String status = task.isCompleted() ? "[Completed]" : "[Pending]";
            System.out.println(status + " " + task.getDescription());
        }
    }
}