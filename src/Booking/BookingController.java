package Booking;

import com.jfoenix.controls.JFXDrawer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BookingController implements Initializable{

    @FXML
    private Label suite;
    @FXML
    private Label suite2;
    @FXML
    private Label suite3;
    @FXML
    private Label suite4;
    @FXML
    private Label suite5;
    @FXML
    private Label suite6;
    @FXML
    private AnchorPane pane;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private Label home;
    @FXML
    private Label login;
    @FXML
    private Label offers;
    @FXML
    private Label payement;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void press1(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite1.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
               drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    } @FXML
    public void press2(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite2.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
                drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    } @FXML
    public void press3(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite3.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
                drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    } @FXML
    public void press4(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite4.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
                drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    } @FXML
    public void press5(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite5.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
                drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    } @FXML
    public void press6(){

        try {
            HBox box = FXMLLoader.load(getClass().getResource("/Booking/Suite6.fxml"));
             drawer.setSidePane(box);

            if (drawer.isShown())
                drawer.close();

            else
                drawer.open();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void Home() throws IOException {


            Stage stages = (Stage)this.home.getScene().getWindow();
            stages.close();


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/HomePage/HomePage2.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }

        @FXML
         public void login() throws IOException {



            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LoginFrontPage/LoginFXML.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }
        @FXML
        public void offerss() throws IOException {



            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LoginFrontPage/LoginFXML.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();
            JOptionPane.showMessageDialog(null,"Login to see offers");

            Stage stages = (Stage)this.offers.getScene().getWindow();
            stages.close();

        } @FXML
    public void payements() throws IOException {




            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("welcome");
            stage.setResizable(false);
            stage.show();

        }
}
