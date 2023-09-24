package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskMentorTestSuite {
    @Test
    public void taskTestUpdate() {


        Mentor adamChojnacki = new Mentor("Adam Chojnacki");
        Mentor emiliaRudnicka = new Mentor("Emilia Rudnicka");

        TasksQueue michałPatas = new TasksQueue("Michał Patas");
        TasksQueue jakubWawrzyniec = new TasksQueue("Jakub Wawrzyniec");
        TasksQueue adamSamorski = new TasksQueue("Adam Samorski");
        TasksQueue grzegorzBrzęczyszczykiewicz = new TasksQueue("Grzegorz Brzęczyszczykiewicz");

        michałPatas.registerObserver(adamChojnacki);
        jakubWawrzyniec.registerObserver(adamChojnacki);
        adamSamorski.registerObserver(adamChojnacki);
        grzegorzBrzęczyszczykiewicz.registerObserver(emiliaRudnicka);




        michałPatas.addTask("Test task 1");
        jakubWawrzyniec.addTask("Test task 2");
        adamSamorski.addTask("Test task 1");
        grzegorzBrzęczyszczykiewicz.addTask("Test task 1");

        assertEquals(3, adamChojnacki.getUpdateCount());
        assertEquals(1, emiliaRudnicka.getUpdateCount());

    }

}
