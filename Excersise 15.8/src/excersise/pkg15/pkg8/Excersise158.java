/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise158 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane=new Pane();
        Text text=new Text();
        
        pane.getChildren().add(text);
        
        Scene scene = new Scene(pane, 300, 250);
        
        scene.setOnMouseClicked(e->
        {
            text.setX(e.getX());
            text.setY(e.getY());
            text.setText("("+e.getX()+","+e.getY()+")");
        });

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
