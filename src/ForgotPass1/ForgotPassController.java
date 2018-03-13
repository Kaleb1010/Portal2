package ForgotPass1;

import ForgotPass2.RetrievePassController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ForgotPassController implements Initializable {


    @FXML
    private TextField FrgUser;
    @FXML
    private TextField fgtusername;
    @FXML
    private Button  Submit;


    Page1 page1 =new Page1();
    String Eml;
    String username;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    @FXML
    private void BtnSubmit(ActionEvent events) throws SQLException {

        Eml = FrgUser.getText().toString();
         username = fgtusername.getText().toString();



        if (this.page1.Fgtpass(Eml,username)){
            try {

                Stage stage = (Stage) this.Submit.getScene().getWindow();
                stage.close();


                FXMLLoader fxmlLoader = new FXMLLoader();
                Pane root1 = fxmlLoader.load(getClass().getResource("/ForgotPass2/RetrievePass2.fxml").openStream());
                RetrievePassController retrievePassController = fxmlLoader.getController();
                retrievePassController.passing(Eml);
                fxmlLoader.setController(retrievePassController);

                Stage stages = new Stage();
                stages.setScene(new Scene(root1));
                stages.setTitle("welcome");
                stages.setResizable(false);
                stages.show();
            }catch (IOException f){
                System.err.println(f);
            }





        }


    }
}
