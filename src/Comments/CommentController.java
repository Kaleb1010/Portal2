package Comments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class CommentController  implements Initializable{

    @FXML
    private TextArea area;
    @FXML
    private Button update;
    @FXML
    private Label one;
    @FXML
    private Label two;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


    String POST;

    @FXML
    public  void post(ActionEvent event){
      POST = area.getText().toString();

      if (event.getSource() == update){
          one.setText(POST);
          area.setText("");
      }

    }

}
