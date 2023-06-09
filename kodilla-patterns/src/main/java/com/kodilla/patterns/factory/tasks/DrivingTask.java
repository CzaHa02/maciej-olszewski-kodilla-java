package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;

    @Override
    public String toString() {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                '}';
    }

    private final String where;
    private final String using;
    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
