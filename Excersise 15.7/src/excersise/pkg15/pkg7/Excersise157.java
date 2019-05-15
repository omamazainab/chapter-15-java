/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise157 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle circle=new Circle(100,100,50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        
        Pane pane=new Pane();
        pane.getChildren().add(circle);
        
        circle.setOnMousePressed(e-> {
            circle.setFill(Color.BLACK);
        });
        
        circle.setOnMouseReleased(e->
        {
            circle.setFill(Color.WHITE);
        });
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
