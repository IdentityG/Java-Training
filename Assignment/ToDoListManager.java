import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation: add, view, remove, exit");
            String operation = scanner.nextLine();

            switch (operation.toLowerCase()) {
                case "add":
                    addTask(scanner);
                    break;
                case "view":
                    viewTasks();
                    break;
                case "remove":
                    removeTask(scanner);
                    break;
                case "exit":
                    System.out.println("Exiting the To-Do List Manager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Enter task index to remove: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Task removed!");
            } else {
                System.out.println("Invalid index. No task removed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index.");
        }
    }
}

