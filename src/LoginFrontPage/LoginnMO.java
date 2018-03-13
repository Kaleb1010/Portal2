package LoginFrontPage;

import DBConnection.Dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginnMO {

    Connection connection;

    public LoginnMO() {
        try {
            this.connection = Dbconnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection == null) {
            System.exit(1);
        }

    }
    public boolean isDataBaseConnected(){
        return this.connection != null;
    }
    public  boolean isLogin(String user ,String  pass) throws SQLException {

        PreparedStatement pr = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM hoteldb where email = ? and password = ? " ;

        try{
            pr = connection.prepareStatement(sql);
            pr.setString(1,user);
            pr.setString(2,pass);

            rs = pr.executeQuery();


            boolean bolli;

            return rs.next();

        } catch (SQLException e) {

            return false;

        }
        finally {

            pr.close();
            rs.close();
        }
    }
}
