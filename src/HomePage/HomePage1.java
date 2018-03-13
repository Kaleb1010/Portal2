package HomePage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HomePage1 extends Application {

        public static void main(String[] args) {
            launch(args);

        }


        @Override
        public void start(Stage primaryStage) throws Exception {

            Parent pr = FXMLLoader.load(getClass().getResource("HomePage2.fxml"));


            Image image =  new Image("/LoginFrontPage/images (5).png");
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(pr);
         //   primaryStage.setResizable(false);


            primaryStage.setScene(scene);
            primaryStage.setTitle("welcome");
            primaryStage.show();



        }


    }

