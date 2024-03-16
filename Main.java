package StackTaskManager;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: 1 - Add Task, 2 - Mark Task as Completed, 3 - Undo Task Completion, 4 - Display Tasks, 0 - Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    scanner.nextLine(); // Consume the newline character
                    String description = scanner.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    manager.markTaskAsCompleted();
                    break;
                case 3:
                    manager.undoTaskCompletion();
                    break;
                case 4:
                    manager.displayTasks();
                    break;
                case 0:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
