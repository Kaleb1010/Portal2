package Drawer;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Browser extends Region {

        final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        public Browser(){
          getStyleClass().add("browser");
          webEngine.load("http://www.google.com");
          getChildren().add(browser);
        }

        private Node createSpacer(){
            Region spacer = new Region();
            HBox.setHgrow(spacer, Priority.ALWAYS);
            return spacer;

        }

        protected void LayoutChildren(){
            double w = getWidth();
            double h = getHeight();
            layoutInArea(browser,0,0,w,h,0, HPos.CENTER, VPos.CENTER);


        }


    protected double computerWidth( double height){
            return 750;

    }
    protected double Comprefheight(double width){
        return 500;
    }
}
