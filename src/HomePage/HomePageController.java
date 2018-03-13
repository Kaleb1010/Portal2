package HomePage;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomePageController implements Initializable {

    @FXML
    private JFXHamburger ham;
    @FXML
    private JFXDrawer drawer;
    @FXML
    private JFXButton Booking;
    @FXML
    private JFXTextField reg;
    @FXML
    private ImageView image;
    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;
    @FXML
    private ImageView image5;
    @FXML
    private ImageView image6;
    @FXML
    private ImageView image7;
    @FXML
    private ImageView image8;
    @FXML
    private ImageView image9;
    @FXML
    private ImageView image10;
    @FXML
    private AnchorPane panes;
    @FXML
    private DatePicker bk1;
    @FXML
    private DatePicker bk2;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            VBox vBox = FXMLLoader.load(getClass().getResource("../Drawer/Drawer.fxml"));

            drawer.setSidePane(vBox);


            HamburgerNextArrowBasicTransition backArrowBasicTransition = new HamburgerNextArrowBasicTransition(ham);
            backArrowBasicTransition.setRate(-1);
            ham.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) -> {
                backArrowBasicTransition.setRate(backArrowBasicTransition.getRate() * -1);
                backArrowBasicTransition.play();

                if (drawer.isShown())
                    drawer.close();
                else
                    drawer.open();


            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pane(){
        panes.setVisible(false);
    }

    @FXML
    public void reg1(MouseEvent event) {
        if (event.getSource() == image1) {
            Image im = image1.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg2(MouseEvent event) {
        if (event.getSource() == image2) {
            Image im = image2.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg3(MouseEvent event) {
        if (event.getSource() == image3) {
            Image im = image3.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg4(MouseEvent event) {
        if (event.getSource() == image4) {
            Image im = image4.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg5(MouseEvent event) {
        if (event.getSource() == image5) {
            Image im = image5.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg6(MouseEvent event) {
        if (event.getSource() == image6) {
            Image im = image6.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg7(MouseEvent event) {
        if (event.getSource() == image7) {
            Image im = image7.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }

    }

    @FXML
    public void reg8(MouseEvent event) {
        if (event.getSource() == image8) {
            Image im = image8.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg9(MouseEvent event) {
        if (event.getSource() == image9) {
            Image im = image9.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void reg10(MouseEvent event) {
        if (event.getSource() == image10) {
            Image im = image10.getImage();


            image.setFitHeight(180);
            image.setFitWidth(339);
            image.setImage(im);
        }
    }


    @FXML
    public void Booking1(ActionEvent event) {

        if (bk1 == null){
            JOptionPane.showMessageDialog(null,"Please input check-in and check-out date");
        }
        else {
            try {

                Stage stage = (Stage) this.Booking.getScene().getWindow();
                stage.close();

                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Booking/Booking1.fxml"));
                Parent root1 = fxmlLoader.load();


                Stage stage1 = new Stage();
                stage1.setScene(new Scene(root1));
                stage1.setTitle("news");
                stage1.setResizable(false);
                stage1.show();

            } catch (IOException x) {
                System.err.println(x);
            }
        }

    }
}






