package ForgotPass2;

import DBConnection.Dbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RetrievePass {

    String sql = "UPDATE hoteldb SET  `password`= ? WHERE `hoteldb`.`email` = ?" ;


    public void update(  String password,String email){
        try(Connection conn = Dbconnection.getConnection()


        ) {
            PreparedStatement stmt = conn.prepareStatement(sql);
            // stmt.setString(1, id);
           // stmt.setString(1, name);
           // stmt.setString(2, email);
            stmt.setString(1, password);
            stmt.setString(2, email);

           // stmt.setString(4, dob);
           // stmt.setString(5, Department);


            stmt.execute();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
