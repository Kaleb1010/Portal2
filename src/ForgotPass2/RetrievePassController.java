package ForgotPass2;

import DBConnection.Dbconnection;
import SignUp.SignUp1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RetrievePassController implements Initializable {

    RetrievePass retrievePass = new RetrievePass();
    @FXML
    private TextField nwpass;
    @FXML
    private TextField retypepass;
    @FXML
    private Button update;

    String newpass;

    Connection connection;
    String email;

    public RetrievePassController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }



    public void passing(String var){
        email = var;

    }
    public void Updat(ActionEvent event) {
        newpass = nwpass.getText().toString();
        String retype = retypepass.getText().toString();

        try{
            connection = Dbconnection.getConnection();


            if (newpass.isEmpty() || retype.isEmpty()  ) {

                JOptionPane.showMessageDialog(null, "Fill empty fields","Error",JOptionPane.WARNING_MESSAGE);
            } else {
                if (newpass.equals(retype)){
                    retrievePass.update(newpass,email);
                    JOptionPane.showMessageDialog(null, "Registration successful, you can now login");
                    nwpass.setText("");
                    retypepass.setText("");

                }

                else{
                    JOptionPane.showMessageDialog(null, "Passwords don't match");
                    nwpass.setText("");
                    retypepass.setText("");

                }




            }



        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}

