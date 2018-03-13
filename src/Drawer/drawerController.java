package Drawer;

import HomePage.HomePageController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class drawerController implements Initializable{

    @FXML
    private Label news;
    @FXML
    private Label review;
    @FXML
    private Label gallery;
    @FXML
    private Label aboutus;
    @FXML
    private Label backs;
    @FXML
    private Button back;
    private Scene scene;

    HomePageController homePageController = new HomePageController();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    public void news1(){
        try {

            Stage stage = (Stage) this.news.getScene().getWindow();
            stage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/LoginFrontPage/loginFXML.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.setTitle("news");
            stage1.setResizable(false);
            stage1.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }
    @FXML
    public void review1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Reviews/reviews1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("news");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }
    @FXML
    public void gallery1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Language/Languge.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("gallery");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }
    @FXML
    public void aboutus1(){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AboutUs/AboutUs1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("gallery");
            stage.setResizable(false);
            stage.show();

        }catch (IOException x){
            System.err.println(x);
        }

    }

    @FXML
    public void back1(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("web");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Drawer.Browser"));
        Parent root1 = fxmlLoader.load();
        scene = new Scene(root1,750,500, Color.web("666970"));
        stage.setScene(scene);
      //  scene.getStylesheets().add("webviewexample/BrowserToolBar.css");
         stage.show();

        //  drawer.close();
//
    }



}
