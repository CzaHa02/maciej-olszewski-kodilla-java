package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {
    @Test
    void testConnection() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        assertNotNull(dbManager.getConnection());

    }

    @Test
    void  testSelectUsers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();

        String sqlQuery = "SELECT * FROM USERS";

        Statement statement = dbManager.getConnection().createStatement();

        ResultSet rs = statement.executeQuery(sqlQuery);


        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID")+ ", "+
                    rs.getString("FIRSTNAME")+ ", "+
                    rs.getString("LASTNAME"));
            counter++;
        }
rs.close();
statement.close();
assertEquals(5, counter);
    }


    @Test
    void testSelectUsersAndPosts() throws SQLException {

        DbManager dbManager = DbManager.getInstance();

        String sqlQuery = """
                 SELECT U.FIRSTNAME, U.LASTNAME,COUNT(P.USER_ID) POSTCOUNTER
                       FROM USERS U
                       JOIN POSTS P on U.ID = P.USER_ID
                       GROUP BY U.ID
                       HAVING COUNT(P.USER_ID)>=2;
                               
                """;
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME")  + " " +
                    resultSet.getString("LASTNAME") + "\n" + " Posts counter: " +
                    resultSet.getString("POSTCOUNTER"));
            counter++;
        }
        resultSet.close();
        statement.close();
        assertEquals(2, counter);
    }

}


