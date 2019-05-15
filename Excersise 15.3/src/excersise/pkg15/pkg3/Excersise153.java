/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg3;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise153 extends Application {
    
    
    
    @Override
    public void start(Stage primaryStage) {
       
        BallPane ball=new BallPane(400,400);
        
        Button btLeft =new Button("Left");
        Button btRight =new Button("Right");
        Button btUp =new Button("UP");
        Button btDown =new Button("Down");
        
        HBox buttonContainer =new HBox();
        
        buttonContainer.getChildren().addAll(btLeft,btRight,btUp,btDown);
        //buttonContainer.setAlignment(Pos.BOTTOM_CENTER);
        
        
        BorderPane pane=new BorderPane();
        
        //pane.setAlignment(Pos.CENTER);
        //pane.setVgap(50);
        pane.setCenter(ball);
        pane.setBottom(buttonContainer);
        //pane.add(buttonContainer, 0, 1);
        
        Scene scene = new Scene(pane,400,400);
        
        btLeft.setOnAction(e ->
        {
            ball.moveLeft();
        });
        
        btRight.setOnAction(e ->
        {
            ball.moveRight();
        });
        
        btUp.setOnAction(e ->
        {
            ball.moveUp();
        });
        
        btDown.setOnAction(e ->
        {
            ball.moveDown();
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

class BallPane extends Pane
{
    Circle circle=new Circle(100,100,40);
    double height,width;
    
    
    public BallPane(double height,double width)
    {
        this.height=height;
        this.width=width;
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().add(circle);
    }
    
            
    public void moveUp()
    {
        if(circle.getCenterY()>circle.getRadius())
        circle.setCenterY(circle.getCenterY()-10);
    }
    
    public void moveDown()
    {
        if(circle.getCenterY()<height-circle.getRadius())
        circle.setCenterY(circle.getCenterY()+10);
    }
    
    public void moveLeft()
    {
        if(circle.getCenterX()>circle.getRadius())
        circle.setCenterX(circle.getCenterX()-10);
    }
    
    public void moveRight()
    {
        if(circle.getCenterX()<width-circle.getRadius())
        circle.setCenterX(circle.getCenterX()+10);
    }
}