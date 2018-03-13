package SignUp;

import DBConnection.Dbconnection;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUpController implements Initializable {


    @FXML
    private JFXTextField name1;
    @FXML
    private JFXTextField email2;
    @FXML
    private JFXPasswordField input3;
    @FXML
    private DatePicker DOB;
    @FXML
    private JFXTextField dept5;
    @FXML
    private JFXButton registerbtnn;
    @FXML
    private  JFXTextField pass;
    @FXML
    private ImageView imagess;
    @FXML
    private Label showpasss;
    @FXML
    private JFXButton homebtn;
    @FXML
    private Label label1;



    String first;
    String second;
    String third;
    String forth;
    String fifth;
    String seven;
    String eight;
    String nine;
    String ten;
    Connection connection;


    boolean check = false;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public boolean Entered(String email){
        String Email = "[a-zA-Z0-9]{1,20}@[a-zA-Z].[a-zA-Z]{2,3}";

        Pattern pattern = Pattern.compile(Email);
        Matcher matcher = pattern.matcher(email);

        return !matcher.matches();

    }
    public boolean val(String emails) throws SQLException {
        ResultSet rs;
        ArrayList<String> strings = new ArrayList<>();

        try {
            connection = Dbconnection.getConnection();
            String sql = "SELECT * from `hoteldb`";
            PreparedStatement pr = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            rs = pr.executeQuery();


            while (rs.next()) {
                String Emails = rs.getString("email");
                strings.add(Emails);



            }


        } catch (SQLException e) {
            System.err.println(e);
        }
        if (strings.contains(emails)) {

            return true;
        }
        else {
            return false;
        }
    }





    @FXML
    public  void regB(ActionEvent b){

        first = name1.getText().toString();
        String sixth = dept5.getText().toString();
        second = email2.getText().toString();
        third = input3.getText().toString();
        forth = pass.getText().toString();
        fifth = DOB.getEditor().getText().toString();


        String name = String.valueOf(first.charAt(0));
        String Name = first.replaceFirst(name,name.toUpperCase());
        String splitting[] = fifth.split("/");
        String Year = splitting[2];
        String Month = splitting[0];
        String day = splitting[1];

        if(Month.length() <= 1){
            Month = "0" + Month;
        }
        if(day.length() <= 1){
            day = "0" + day;
        }

        System.out.println(Year);
        System.out.println(Month);
        System.out.println(day);

        fifth = Year + Month + day;
 



        try{
            connection = Dbconnection.getConnection();

            SignUp1 signUp1 = new SignUp1();



               if (first.isEmpty() || second.isEmpty() || third.isEmpty() || forth.isEmpty() ||fifth.isEmpty() || sixth.isEmpty() ) {

                   JOptionPane.showMessageDialog(null, "Fill empty fields","Error",JOptionPane.WARNING_MESSAGE);
                        } else {
                   if (third.equals(forth)){
                       boolean match = Entered(second);
                       if(match){
                              boolean vali = val(second);
                              if (!vali) {
                                  signUp1.add(Name, second, third, sixth, fifth);
                                  JOptionPane.showMessageDialog(null, "Registration successful, you can now login");
                                  name1.setText("");
                                  email2.setText("");
                                  input3.setText("");
                                  pass.setText("");
                                  dept5.setText("");
                              }
                              else{
                                  JOptionPane.showMessageDialog(null,"email already exists");
                                  email2.requestFocus();
                              }
                       }
                       else {
                           JOptionPane.showMessageDialog(null,"Invalid email format");
                           email2.requestFocus();
                       }

                   }
                   else{
                       JOptionPane.showMessageDialog(null, "Passwords don't match");
                       input3.setText("");
                       pass.setText("");
                   }
               }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }


    @FXML
    public  void HomeBtn(ActionEvent eventss){
        try {

            Stage stages = (Stage)this.homebtn.getScene().getWindow();
            stages.close();


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LoginFrontPage/loginFXML.fxml"));
            Parent root1 = fxmlLoader.load();


            //SignUpController signUpController = new SignUpController();
            //  fxmlLoader.setController(welcomePageController);
            // AnchorPane anchorPane = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }
    @FXML
    private void holding(){
        if(imagess.isPressed()){
            showpasss.setText(input3.getText().toString());
        }
        else {
            showpasss.setText("");
        }

    }
    @FXML
    private void releases(){
        showpasss.setText("");
    }

}

