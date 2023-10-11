package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {

        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";


        Statement statement2 = dbManager.getConnection().createStatement();
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement2.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);


        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
        statement2.close();
    }

    @Test
    public void testBestSellers() throws SQLException {
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=\"0\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS ZEROS FROM BOOKS WHERE BESTSELLER=\"0\"";

        Statement statement1 = dbManager.getConnection().createStatement();
        String call = "CALL UpdateBestsellers()";
        statement1.execute(call);
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);

        int zeros = 0;
        if (resultSet.next()) {
            zeros = resultSet.getInt("ZEROS");
        }
        assertEquals(0, zeros);
        resultSet.close();
        statement.close();
        statement1.close();
    }

}

