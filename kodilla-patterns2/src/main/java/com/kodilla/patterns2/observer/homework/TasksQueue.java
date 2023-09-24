package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TasksQueue implements Observable {
    private final List<Observer> observers;


    private final String studentName;

    private final List<String> taskName;

    public List<String> getTaskName() {
        return taskName;
    }

    public String getStudentName() {
        return studentName;
    }

    public TasksQueue(String studentName) {
        observers = new ArrayList<>();
        taskName = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task) {
        taskName.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }


    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }
}
