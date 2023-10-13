package task01.task;

import java.util.Date;
import java.util.List;

public class Task {
    private String id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<String> tags;

    // Constructors, Getters, Setters

    @Override
    public String toString() {
        return "Task{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", tags=" + tags +
                '}';
    }
}