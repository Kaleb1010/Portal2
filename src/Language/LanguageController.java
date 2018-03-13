package Language;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class LanguageController implements Initializable {
    @FXML
    private JFXButton english;
    @FXML
    private JFXButton french;
    @FXML
    private JFXButton igbo;
    @FXML
    private JFXButton yoruba;
    private ResourceBundle bundle;
    private Locale locale;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void lang_en(ActionEvent event){

    }
    @FXML
    public void lang_fra(ActionEvent event){

    }
    @FXML
    public void lang_ig(ActionEvent event){

    }
    @FXML
    public void lang_yor(ActionEvent event){

    }

    private void Longlang(String lang){
        locale = new Locale(lang);
        bundle = ResourceBundle.getBundle("Language",locale);

    }
}
