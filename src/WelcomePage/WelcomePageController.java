package WelcomePage;

import DBConnection.Dbconnection;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class WelcomePageController implements Initializable {
    Connection connection;

    WelcomePageMO welcomePageMO = new WelcomePageMO();



    @FXML
    private Label dbStat;
    @FXML
    private Label input1;
    @FXML
    private Button home1;
    @FXML
    private JFXButton trips;
    @FXML
    private JFXButton restaurant;
    @FXML
    private  JFXButton booking;
    @FXML
    private  JFXButton cash;
    @FXML
    private  JFXButton comment;
    @FXML
    private  JFXButton rating;
    String bar;




    public WelcomePageController() {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (this.welcomePageMO.isDataBaseConnected()) {
            this.dbStat.setText("Connected");
        } else {
            this.dbStat.setText("not connected");
        }

    }

    @FXML
    public void Refresh(String user) {


        ResultSet rs;
        bar = user;
        try {
            connection = Dbconnection.getConnection();
            String sql = "select * from hoteldb where email = ?";
            PreparedStatement pr = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            pr.setString(1, user);
            // pr.setString(2, pass);

            rs = pr.executeQuery();


            while (rs.next()) {
                String NAME = rs.getString("username");



                this.input1.setText( "WELCOME  " + NAME.toUpperCase());
              //  label1.setText(NAME);
               // this.input1.setText(NAME);


                System.out.println("name is" + NAME);
            }
        } catch (SQLException f) {
            System.err.println(f);
        }
    }

    @FXML
    public void Home2(ActionEvent eventsss){
        try {

            Stage stages = (Stage)this.home1.getScene().getWindow();
            stages.close();


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LoginFrontPage/loginFXML.fxml"));
            Parent root1 = fxmlLoader.load();



          //  SignUpController signUpController = new SignUpController();
            //  fxmlLoader.setController(welcomePageController);
            // AnchorPane anchorPane = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.out.println(x);
        }

    }

    @FXML
    public void  View(ActionEvent event){
        try {

            Stage stages = (Stage)this.home1.getScene().getWindow();
            stages.close();


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ViewClassprofile/ViewClass1.fxml"));
            Parent root1 = fxmlLoader.load();



            //  SignUpController signUpController = new SignUpController();
            //  fxmlLoader.setController(welcomePageController);
            // AnchorPane anchorPane = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }catch (IOException q){
            System.err.println(q);
        }

    }


    @FXML
    public void trips1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Trips/Trips1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }

    @FXML
    public void restaurant1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Restaurant/Restaurant1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }


    @FXML
    public void booking1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/EventCentre/eventCentre1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }

    @FXML
    public void cash1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }



    @FXML
    public void Comment1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Comments/Comment1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }


    @FXML
    public void Rating1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Rating/Rating1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("trips");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }


    }


    //LoginController loginController = new LoginController();







