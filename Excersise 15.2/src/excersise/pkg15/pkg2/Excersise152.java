/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise152 extends Application {
    
    int i=1;
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane Conatiner=new BorderPane();
        GridPane pane=new GridPane();
        
        pane.setVgap(50);
        pane.setAlignment(Pos.CENTER);
        
        Rectangle rect=new Rectangle(30,50);
        Button btRotate=new Button("Rotate");
        
        //rectanglConatiner.setCenter(rect);
        //rectanglConatiner.setBottom(btRotate);
        pane.add(rect,0,0);
        pane.add(btRotate, 0, 1);
        Conatiner.setCenter(pane);
        btRotate.setOnAction(e->
        {
            rect.setRotate(15*i);
            i++;
        });
        
        Scene scene = new Scene(Conatiner);
        
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
