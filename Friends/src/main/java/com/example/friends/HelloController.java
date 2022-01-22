package com.example.friends;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {
    public TextField textGetFirst;
    public TextField textGetLast;
    public TextField textGetDiscord;
    public TextField textGetMain;
    public ListView<Friendo> emptyFriendsList = new ListView<>(); //It is called empty because this person has no friends
    public Label LabelFirst;
    public Label LabelLast;
    public Label LabelDiscord;
    public Label LabelMain;
    public Button unfriendo;

    public void addFriendo(ActionEvent actionEvent){
        String F = textGetFirst.getText();
        String L = textGetLast.getText();
        String D = textGetDiscord.getText();
        String M = textGetMain.getText();
        Friendo rando = new Friendo(F,L,D,M);
        emptyFriendsList.getItems().add(rando);
        textGetDiscord.clear();
        textGetFirst.clear();
        textGetLast.clear();
        textGetMain.clear();
        unfriendo.setDisable(true);
    }

    public void displayDeTails(MouseEvent mouseEvent) {
        Friendo rando;
        rando = emptyFriendsList.getSelectionModel().getSelectedItem();
        LabelDiscord.setText(rando.getDiscord());
        LabelFirst.setText(rando.first);
        LabelLast.setText(rando.last);
        LabelMain.setText(rando.getMain());
        unfriendo.setDisable(false);
    }

    public void unfriend(ActionEvent actionEvent) {
        Friendo rando;
        rando = emptyFriendsList.getSelectionModel().getSelectedItem();
        LabelDiscord.setText("");
        LabelFirst.setText("");
        LabelLast.setText("");
        LabelMain.setText("");

        emptyFriendsList.getItems().remove(rando);
        unfriendo.setDisable(true);
    }
}