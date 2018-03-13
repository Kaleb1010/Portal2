package LoginFrontPage;


import ForgotPass1.ForgotPassController;
import SignUp.SignUpController;
import WelcomePage.WelcomePageController;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginnMO loginnMO = new LoginnMO();
    String user;
    String pass;


    @FXML
    private Label dbstat;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField password;
    @FXML
    private JFXButton loginn;
    @FXML
    private JFXButton sign;
    @FXML
    private Label forgot;
    @FXML
    private ImageView image;
    @FXML
    private Label showpass;
    @FXML
     private JFXButton home;
    String t;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.loginnMO.isDataBaseConnected()) {
            this.dbstat.setText("Connected");
        } else {
            this.dbstat.setText("not connected");
        }

    }

    @FXML
    public void home1(ActionEvent event){

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/HomePage/HomePage2.fxml"));
            Parent root1 = fxmlLoader.load();

            Stage stage1 = (Stage) this.loginn.getScene().getWindow();
            stage1.close();


            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        } catch (IOException f) {
            System.err.println(f);
        }

    }


    @FXML
    public void Button1(ActionEvent event) {
        user = email.getText().toString();
        pass = password.getText().toString();



        try {
            if (this.loginnMO.isLogin(user, pass)) {

                Stage stage = (Stage) this.loginn.getScene().getWindow();
                stage.close();
                student();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong credentials", "Invalid User", JOptionPane.ERROR_MESSAGE);
                email.setText("");
                password.setText("");


                }

        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public void student() {
        try {



            Stage stage1 = new Stage();

            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root1 = fxmlLoader.load(getClass().getResource("/WelcomePage/Welcome2.fxml").openStream());
            WelcomePageController welcomePageController = fxmlLoader.getController();
            welcomePageController.Refresh(user);
            fxmlLoader.setController(welcomePageController);


            stage1.setScene(new Scene(root1));
            stage1.setTitle("welcome");
            stage1.setResizable(false);
            stage1.show();
        }catch (Exception h){
            System.err.println(h);
        }

    }



    @FXML
    public void SignBtn(ActionEvent events) {
        Stage stage = (Stage) this.sign.getScene().getWindow();
        stage.close();
        Sign();
    }

    //  public String gett(){
    // return email.getText().toString();
    //  }


    public void WelcomePage(String user) {


    }


    public void Sign() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/SignUp/SignUp2.fxml"));
            Parent root1 = fxmlLoader.load();


            SignUpController signUpController = new SignUpController();
            //  fxmlLoader.setController(welcomePageController);
            // AnchorPane anchorPane = fxmlLoader.load();


            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            //stage.setResizable(false);
            stage.show();

        } catch (IOException x) {
            System.err.println(x);
        }

    }

    @FXML
    private void Forgot() {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ForgotPass1/ForgotPass3.fxml"));
            Parent root1 = fxmlLoader.load();


            ForgotPassController forgotPassController = new ForgotPassController();

            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        } catch (IOException f) {
            System.err.println(f);
        }

    }

    @FXML
    private void hold() {
        if (image.isPressed()) {
            showpass.setText(password.getText().toString());
        } else {
            showpass.setText("");
        }

    }

    @FXML
    private void release() {
        showpass.setText("");
    }





}

