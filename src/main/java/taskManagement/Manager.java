package taskManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager {
    private List<Task> tasks;

    public Manager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasksSortedByDate() {
        return tasks.stream().sorted(Comparator.comparing(Task::deadline)).toList();
    }

    public List<Task> getTasksSortedByPriority(int priority) {
        return tasks.stream().filter(task -> task.priority() == priority).toList();
    }
}

