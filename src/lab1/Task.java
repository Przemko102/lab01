package lab1;

import java.time.LocalDateTime;

public class Task {
    public enum Category {
        NEW, IN_PROGRESS, DONE
    }

    private String taskName;
    private String taskDescription;
    private Category taskCategory;
    private LocalDateTime taskDateTimeStart;
    private LocalDateTime taskDateTimeStop;

    public Task(String taskName, String taskDescription,
                Category taskCategory, LocalDateTime taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;
        this.taskDateTimeStart = LocalDateTime.now();
    }

    public String getName() {
        return taskName;
    }
    public void setName(String newName) {
        taskName = newName;
    }

    public String getDescription() {
        return taskDescription;
    }
    public void setDescription(String newDescription) {
        taskDescription = newDescription;
    }

    public Category getCategory() {
        return taskCategory;
    }
    public void setCategory(Category newCategory) {
        taskCategory = newCategory;
    }

    public LocalDateTime getStart() {
        return taskDateTimeStart;
    }
    public void setStart(LocalDateTime newStart) {
        taskDateTimeStart = newStart;
    }

    public LocalDateTime getStop() {
        return taskDateTimeStop;
    }
    public void setStop(LocalDateTime newStop) {
        taskDateTimeStop = newStop;
    }

    public String toString() {
        return "Name: " + taskName + ", description: " + taskDescription +
                ", category: " + taskCategory +
                "\nstart time: " + taskDateTimeStart +
                "\nend time: " + taskDateTimeStop;
    }
}

