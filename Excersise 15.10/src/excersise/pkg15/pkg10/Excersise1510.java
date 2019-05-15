/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg10;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise1510 extends Application {
    
    final static double height=300,width=250;
    static double previousX=height/2,previousY=width/2;
    @Override
    public void start(Stage primaryStage) {
        
        
        
        Pane pane=new Pane();
        Polyline line=new Polyline(height/2,width/2);
        pane.getChildren().add(line);
        ObservableList<Double> list =line.getPoints();
        
        //02134590538
        pane.setOnMouseClicked(e->{
            //for x-axis
                
            
                list.add(e.getX());
                list.add(previousY);
           
                list.add(e.getX());
                list.add(e.getY());
                previousX=e.getX();
                previousY=e.getY();
            
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
