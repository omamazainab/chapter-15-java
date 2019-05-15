/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise156 extends Application {
    boolean alternater=true;
    @Override
    public void start(Stage primaryStage) {
        
        Pane pane=new Pane();
        Text text= new Text(100,100,"click me");
        pane.getChildren().add(text);
        
        Scene scene = new Scene(pane, 300, 250);
        
        text.setOnMouseClicked(e->{
            
            if(alternater==true)
            {
                text.setText("Java is fun");
                alternater=false;
            }
            else
            {
                text.setText("Java is Powerful");
                alternater=true;
            }
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
