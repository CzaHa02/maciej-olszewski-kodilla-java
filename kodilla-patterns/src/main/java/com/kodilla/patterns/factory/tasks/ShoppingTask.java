package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", taskExecuted=" + taskExecuted +
                '}';
    }

    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecuted;

    public  ShoppingTask(String taskName, String whatToBuy, double quantity,  boolean taskExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.taskExecuted = taskExecuted;
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
