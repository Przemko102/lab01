package lab1;

import java.time.LocalDateTime;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Task> list = new ArrayList<>();

        Task task1 = new Task("Task title", "Task description", Task.Category.NEW, LocalDateTime.of(2021, 10, 5, 11, 20));
        Task task2 = new Task("Task2", "do shopping", Task.Category.IN_PROGRESS, LocalDateTime.of(2021, 5, 5, 20, 10));
        Task task3 = new Task("Last task", "Do everything", Task.Category.DONE, LocalDateTime.now());
        Task task4 = new Task("Prolongate", "Do be extended", Task.Category.NEW, LocalDateTime.now());

        task4.setStop(task4.getStop().plusMonths(3));

        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);

        for (Task task : list) {
            System.out.println(task);
        }
    }
}
