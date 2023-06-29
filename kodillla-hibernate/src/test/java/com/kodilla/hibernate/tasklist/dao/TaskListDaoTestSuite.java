package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Test
    void testFindByListName(){
        TaskList taskList1 = new TaskList("List 1", "Description 1");
        TaskList taskList2 = new TaskList("List 2", "Description 2");

        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        List<TaskList> results= taskListDao.findByListName("List 1");
        List<TaskList> result2= taskListDao.findByListName("List 2");

        Assertions.assertEquals(1, results.size());
        Assertions.assertEquals("List 2", results.get(0).getListName());

        int id = results.get(0).getId();
        taskListDao.deleteById(id);

    }
}
