package taskManagement;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Manager manager = new Manager();

        Task task1 = new Task("Implement simple app with the knowledge you have", LocalDateTime.of(2024, 10, 23, 12, 0), 1);
        Task task2 = new Task("Research about topic of the day", LocalDateTime.of(2024, 10, 23, 14, 30), 1);
        Task task3 = new Task("Ask Alek about Collections", LocalDateTime.of(2024, 10, 22, 14, 30), 4);
        Task task4 = new Task("Afterwork with team", LocalDateTime.of(2024, 10, 27, 17, 30), 5);

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);
        manager.addTask(task4);

        manager.getTasksSortedByDate().forEach(System.out::println);
//        manager.getTasksSortedByPriority(1).forEach(System.out::println);
    }
}
