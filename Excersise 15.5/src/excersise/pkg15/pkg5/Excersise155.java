/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excersise.pkg15.pkg5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author danyyal shakaib
 */
public class Excersise155 extends Application {
    
        TextField tfInvestmentAmount=new TextField();
        TextField tfNumberOfYears=new TextField();
        TextField tfAnnualInterestRate=new TextField();
        TextField tfFutureValue=new TextField();
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane pane=new GridPane();
        pane.add( new Label("Investment Amount"),0,0);
        pane.add( new Label("Number of Years"),0,1);
        pane.add( new Label("Annual Interest Rate"),0,2);
        pane.add( new Label("Future Value"),0,3);
        
        
        Button Calculate=new Button("Calculate");
        
        pane.add(tfInvestmentAmount, 1, 0);
        pane.add(tfNumberOfYears, 1, 1);
        pane.add(tfAnnualInterestRate, 1, 2);
        pane.add(tfFutureValue, 1, 3);
        pane.add(Calculate, 1, 4);
        
        tfFutureValue.setEditable(false);
        
        Calculate.setOnAction(e->FutureValueCalculate());
        
        Scene scene = new Scene(pane, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void FutureValueCalculate()
    {
            double investmentAmount=Double.parseDouble(tfInvestmentAmount.getText());
            int numberOfYears=Integer.parseInt(tfNumberOfYears.getText());;
            double annualInterestRate=Double.parseDouble(tfAnnualInterestRate.getText());;;
            double futureValue;
            
            Loan loan=new Loan(investmentAmount,numberOfYears,annualInterestRate);
            
            futureValue=investmentAmount*(Math.pow(1+loan.getMonthlyPayment(), numberOfYears*12));
            tfFutureValue.setText(String.valueOf(futureValue));
    }
    
    class Loan {
 private double annualInterestRate;
private int numberOfYears;
private double loanAmount;
 private java.util.Date loanDate;

 /** Default constructor */
 public Loan() {
this(2.5, 1, 1000);
 }
public Loan(double annualInterestRate, int numberOfYears,
 double loanAmount) {
 this.annualInterestRate = annualInterestRate;
 this.numberOfYears = numberOfYears;
 this.loanAmount = loanAmount;
 loanDate = new java.util.Date();
 }

 /** Return annualInterestRate */
 public double getAnnualInterestRate() {
 return annualInterestRate;
 }

 /** Set a new annualInterestRate */
 public void setAnnualInterestRate(double annualInterestRate) {
 this.annualInterestRate = annualInterestRate;
 }

 /** Return numberOfYears */
 public int getNumberOfYears() {
 return numberOfYears;
 }

 /** Set a new numberOfYears */
 public void setNumberOfYears(int numberOfYears) {
 this.numberOfYears = numberOfYears;
 }

 /** Return loanAmount */
 public double getLoanAmount() {
 return loanAmount;
 }

 /** Set a new loanAmount */
 public void setLoanAmount(double loanAmount) {
 this.loanAmount = loanAmount;
 }

 /** Find monthly payment */
 public double getMonthlyPayment() {
 double monthlyInterestRate = annualInterestRate / 1200;
 double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
 (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
 return monthlyPayment;
 }

 /** Find total payment */
 public double getTotalPayment() {
 double totalPayment = getMonthlyPayment() * numberOfYears * 12;
 return totalPayment;
 }

 /** Return loan date */
 public java.util.Date getLoanDate() {
 return loanDate;
 }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
