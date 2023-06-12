package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    void testToDo(){

        board.getDoneList().getTasks().add("teremorele 1");
        board.getToDoList().getTasks().add("teremorele 2");
        board.getInProgressList().getTasks().add("teremorele 3");


        String done= board.getDoneList().getTasks().get(0);
        String toDo=board.getToDoList().getTasks().get(0);
        String inProg=board.getInProgressList().getTasks().get(0);

        Assertions.assertEquals("teremorele 1",done);
        Assertions.assertEquals("teremorele 2",toDo);
        Assertions.assertEquals("teremorele 3",inProg);

        System.out.println("teremorele 1 = "+done);
        System.out.println("teremorele 2 = "+toDo);
        System.out.println("teremorele 3 = "+inProg);





    }
}
