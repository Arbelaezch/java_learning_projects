import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        
        boolean running = true;
        while (running) {
            System.out.println("Enter a command: (add, remove, print, exit)");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter a task:");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added: " + task);
                    break;
                case "remove":
                    System.out.println("Enter the index of the task to remove:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // clear the input buffer
                    if (index < tasks.size()) {
                        String removedTask = tasks.remove(index);
                        System.out.println("Task removed: " + removedTask);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case "print":
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in list.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ": " + tasks.get(i));
                        }
                    }
                    break;
                case "exit":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
        
        scanner.close();
    }
}
