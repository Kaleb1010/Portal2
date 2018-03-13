package WelcomePage;

import DBConnection.Dbconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WelcomePageMO {

    Connection connection;

    public WelcomePageMO() {
        try {
            this.connection = Dbconnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection == null) {
            System.exit(1);
        }

    }

    public boolean isDataBaseConnected() {
        return this.connection != null;

    }
}


