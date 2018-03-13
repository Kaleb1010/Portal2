package Restaurant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RestaurantController implements Initializable {

    @FXML
    private Button package1;
    @FXML
    private Button package2;
    @FXML
    private Button package3;
    @FXML
    private Button package4;
    @FXML
    private Button package5;
    @FXML
    private Button package6;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void package11(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
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
    public void package22(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.setTitle("news");
            stage1.setResizable(false);
            stage1.show();

        }catch (IOException x){
            System.err.println(x);
        }


    }  @FXML
    public void package33(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.setTitle("news");
            stage1.setResizable(false);
            stage1.show();

        }catch (IOException x){
            System.err.println(x);
        }


    }  @FXML
    public void package44(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.setTitle("news");
            stage1.setResizable(false);
            stage1.show();

        }catch (IOException x){
            System.err.println(x);
        }


    }  @FXML
    public void package55(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
            Parent root1 = fxmlLoader.load();



            Stage stage1 = new Stage();
            stage1.setScene(new Scene(root1));
            stage1.setTitle("news");
            stage1.setResizable(false);
            stage1.show();

        }catch (IOException x){
            System.err.println(x);
        }


    }  @FXML
    public void package66(ActionEvent event){
        try {


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Cash/Cash1.fxml"));
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
}
