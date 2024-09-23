package taskManagement;

import java.time.LocalDateTime;

public record Task(
        String taskName,
        LocalDateTime deadline,
        int priority) {
}
