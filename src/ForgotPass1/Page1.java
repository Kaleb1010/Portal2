package ForgotPass1;

import DBConnection.Dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Page1 {
    Connection connection;
    public Page1() {
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
    }        public  boolean Fgtpass(String email ,String  username) throws SQLException {

            PreparedStatement pr = null;
            ResultSet rs = null;

            String sql = "SELECT * FROM hoteldb where email = ? and username = ?";

            try{
                pr = connection.prepareStatement(sql);
                pr.setString(1,email);
                pr.setString(2,username);

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

