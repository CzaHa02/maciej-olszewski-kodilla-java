package com.kodilla.stream.portfolio;

import java.time.LocalDate;

public final class Task {

    private final String title;
    private final String description;
    private final Userr assignedUser;
    private final Userr creator;
    private final LocalDate created;
    private final LocalDate deadline;

    public Task(final String title, final String description,
                final Userr assignedUser, final Userr creator,
                final LocalDate created, final LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.assignedUser = assignedUser;
        this.creator = creator;
        this.created = created;
        this.deadline = deadline;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Userr     getAssignedUser() {
        return assignedUser;
    }

    public Userr getCreator() {
        return creator;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", assignedUser=" + assignedUser +
                ", creator=" + creator +
                ", created=" + created +
                ", deadline=" + deadline +
                '}' + "\n";
    }
}