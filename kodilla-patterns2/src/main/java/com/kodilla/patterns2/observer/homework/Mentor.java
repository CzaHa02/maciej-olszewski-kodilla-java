package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String mentorName;

    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TasksQueue forumTopic) {
        System.out.println(mentorName + ": Received new task from student " + forumTopic.getStudentName() + "\n" +
                " (total: " + forumTopic.getTaskName().size() + " messages)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    }

