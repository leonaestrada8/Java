package Final.J4V4.TaskManager41;

import java.util.HashMap;
import java.util.Map;

public class TaskManager {
    private final Map<Integer, String> tasks; // Simulação de um banco de dados em memória

    public TaskManager() {
        this.tasks = new HashMap<>();
    }

    public void addTask(int id, String description) {
        this.tasks.put(id, description);
        System.out.println("Task added: " + description);
    }

    public void listTasks() {
        System.out.println("Listing tasks:");
        for (Map.Entry<Integer, String> entry : this.tasks.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Description: " + entry.getValue());
        }
    }

    public void deleteTask(int id) {
        if (this.tasks.containsKey(id)) {
            this.tasks.remove(id);
            System.out.println("Task with ID " + id + " deleted");
        } else {
            System.out.println("Task not found");
        }
    }

    // Exemplo de uso
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(1, "Task 1");
        taskManager.addTask(2, "Task 2");
        taskManager.listTasks();
        taskManager.deleteTask(1);
        taskManager.listTasks();
    }
}
