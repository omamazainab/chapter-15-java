/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg1;

import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 *
 * @author danyyal shakaib
 */
public class Excersise151 extends Application {
    
    
    
        
    @Override
    public void start(Stage primaryStage) {
       
        ImageView card1=new ImageView();
        ImageView card2=new ImageView();
        ImageView card3=new ImageView();
        ImageView card4=new ImageView();
        Button btRefresh=new Button("Refresh");
        
        HBox imagesContainer=new HBox();
        
        imagesContainer.getChildren().addAll(card1,card2,card3,card4);
                     
        VBox pane=new VBox();
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(imagesContainer,btRefresh);
        
        btRefresh.setOnAction(e->
        {
            Random rand = new Random();
            card1.setImage(new Image("card/"+rand.nextInt(55)+".png"));
            card2.setImage(new Image("card/"+rand.nextInt(55)+".png"));
            card3.setImage(new Image("card/"+rand.nextInt(55)+".png"));
            card4.setImage(new Image("card/"+rand.nextInt(55)+".png"));

        });
        
        
        
	Scene scene = new Scene(pane,300,200);
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
