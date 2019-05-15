/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise154 extends Application {
    
        TextField tfNumber1=new TextField();
        TextField tfNumber2=new TextField();
        TextField tfResult=new TextField();
        
    @Override
    public void start(Stage primaryStage) {
       
        HBox inputNumber=new HBox();
        inputNumber.setPadding(new Insets(5,5,10,5));
        
        tfResult.setEditable(false);
        inputNumber.getChildren().add(new Label("Number 1:"));
        inputNumber.getChildren().add(tfNumber1);
        inputNumber.getChildren().add(new Label("Number 2:"));
        inputNumber.getChildren().add(tfNumber2);
        inputNumber.getChildren().add(new Label("Result :"));
        inputNumber.getChildren().add(tfResult);
        
        HBox buttons=new HBox();
        buttons.setAlignment(Pos.CENTER);
        Button btAdd=new Button("add");
        Button btSubtract=new Button("Subtract");
        Button btMultiply=new Button("Multiply");
        Button btDivsion=new Button("Divsion");
        buttons.getChildren().addAll(btAdd,btSubtract,btMultiply,btDivsion);
        
        VBox pane=new VBox();
        pane.setPadding(new Insets(10,20,10,20));
        pane.getChildren().addAll(inputNumber,buttons);
        
        btAdd.setOnAction(e->Add());
        btSubtract.setOnAction(e->Subtract());
        btMultiply.setOnAction(e->Multiply());
        btDivsion.setOnAction(e->Divide());
        
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void Add()
    {
        double answer = Double.parseDouble(tfNumber1.getText()) + Double.parseDouble(tfNumber2.getText());
        tfResult.setText(answer + "");
    }
    
    
    private void Subtract()
    {
        double answer = Double.parseDouble(tfNumber1.getText()) - Double.parseDouble(tfNumber2.getText());
        tfResult.setText(answer + "");
    }
    
    
    private void Multiply()
    {
         double answer = Double.parseDouble(tfNumber1.getText()) * Double.parseDouble(tfNumber2.getText());
        tfResult.setText(answer + "");
    }
    
    
    private void Divide()
    {
        double answer = Double.parseDouble(tfNumber1.getText()) / Double.parseDouble(tfNumber2.getText());
        tfResult.setText(answer + "");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
