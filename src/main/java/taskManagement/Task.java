package taskManagement;

import java.time.LocalDateTime;

public record Task(
        String taskName,
        LocalDateTime deadline,
        int priority) {

    @Override
    public String toString() {
        return String.format("Task Name: %s\nDeadline: %s\nPriority: %d\n", taskName, deadline, priority);
    }
}
