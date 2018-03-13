package LoginFrontPage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Login extends Application{

            public static void main(String[] args) {
                launch(args);

    }

   /* class WindowButtons extends HBox {

        public WindowButtons() {
            Button closeBtn = new Button("X");

            closeBtn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent actionEvent) {
                    Platform.exit();
                }
            });

            this.getChildren().add(closeBtn);
        }
    }
*/
    @Override
    public void start(Stage primaryStage) throws Exception {
      /*  primaryStage.initStyle(StageStyle.UNDECORATED);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: black;");

        ToolBar toolBar = new ToolBar();

        int height = 25;
        toolBar.setPrefHeight(height);
        toolBar.setMinHeight(height);
        toolBar.setMaxHeight(height);
        toolBar.getItems().add(new WindowButtons());

        borderPane.setTop(toolBar);
*/
        Parent pr = FXMLLoader.load(getClass().getResource("loginFXML.fxml"));


        Image image =  new Image("/LoginFrontPage/images (5).png");
        primaryStage.getIcons().add(image);
        Scene scene = new Scene(pr);
        primaryStage.setResizable(false);
       // Scene scene1 = new Scene(borderPane);
       // primaryStage.setScene(scene1);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();



    }


}