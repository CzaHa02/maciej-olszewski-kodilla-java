package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;

    @Override
    public String toString() {
        return "PaintingTask{" +
                "taskName='" + taskName + '\'' +
                ", color='" + color + '\'' +
                ", whatToPaint='" + whatToPaint + '\'' +
                '}';
    }

    private final String color;
    private final String whatToPaint;

    public  PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Task executed for" +taskName);

    }

    @Override
    public String getTaskName() {
          return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
