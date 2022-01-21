package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class HelloController {

    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;
    public Button zero;
    public Button ac;
    public Button plus;
    public Button minus;
    public Button times;
    public Button equal;
    public Label txt;
    public String numberBuilder = "";

    public String number1 = "";

    public String oper = "";

    private void removeZero(){
        if(numberBuilder.substring(0,1).equals("0")){
            numberBuilder = numberBuilder.substring(1);
        }
    }

    public void one() {
        numberBuilder += "1";
        removeZero();
        txt.setText(numberBuilder);
    }

    public void two() {
        numberBuilder += "2";
        removeZero();
        txt.setText(numberBuilder);
    }
    public void three() {
        numberBuilder += "3";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void four() {
        numberBuilder += "4";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void five() {
        numberBuilder += "5";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void six() {
        numberBuilder += "6";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void seven() {
        numberBuilder += "7";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void eight() {
        numberBuilder += "8";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void nine() {
        numberBuilder += "9";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }
    public void zero() {
        numberBuilder += "0";
        String current = txt.getText();
        txt.setText(numberBuilder);
    }

    public void operate(){

        if(number1.equals("") && !(numberBuilder.equals(""))){
            number1 = numberBuilder;
            numberBuilder = "";
        } else if(numberBuilder.equals("")){

        } else {
            if(oper.equals("plus")){
                int num1 = Integer.parseInt(number1) + Integer.parseInt(numberBuilder);
                number1 = Integer.toString(num1);
            } else if(oper.equals("minus")){
                int num1 = Integer.parseInt(number1) - Integer.parseInt(numberBuilder);
                number1 = Integer.toString(num1);
            } else if(oper.equals("times")){
                int num1 = Integer.parseInt(number1) * Integer.parseInt(numberBuilder);
                number1 = Integer.toString(num1);
            }  else {
                number1 = numberBuilder;
            }
            numberBuilder = "";
        }
        oper = "";
    }

    public void plus() {
        operate();
        System.out.println(number1);
        oper = "plus";
        txt.setText(number1);
    }

    //int number = Integer.parseInt(numberBuilder);

    public void minus() {
        operate();
        System.out.println(number1);
        oper = "minus";
        txt.setText(number1);
    }
    public void times() {
        operate();
        System.out.println(number1);
        oper = "times";
        txt.setText(number1);
    }

    public void equals() {
        operate();
        System.out.println(number1);
        oper = "";
        txt.setText(number1);
    }


    public void clear() {
        number1 = "";
        numberBuilder = "";
        oper = "";
        txt.setText("");
    }


}
