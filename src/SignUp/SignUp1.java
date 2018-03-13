package SignUp;

import DBConnection.Dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SignUp1 {

    String sql = "Insert into `hoteldb`(`name`,`email`,`password`,`username`,`dob`)VALUES(? ,? ,? ,? ,?)";


    public void add( String name, String email, String password, String username,String dob){
        try(Connection conn = Dbconnection.getConnection()


        ) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            // stmt.setString(1, id);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.setString(4, username);
            stmt.setString(5, dob);


            stmt.execute();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
