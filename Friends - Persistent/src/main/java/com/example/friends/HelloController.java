package com.example.friends;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.util.ArrayList;

public class HelloController {
    public TextField textGetFirst;
    public TextField textGetLast;
    public TextField textGetDiscord;
    public TextField textGetMain;
    public ListView<Friendo> emptyFriendsList = new ListView<>(); //It is called empty because this person has no friends
    public ListView<Friendo> emptyFriendsList2 = new ListView<>(); //It is called empty because this person has no friends
    public ListView<Friendo> emptyFriendsList3 = new ListView<>(); //It is called empty because this person has no friends
    public Label LabelFirst;
    public Label LabelLast;
    public Label LabelDiscord;
    public Label LabelMain;
    public Label LabelFirst2;
    public Label LabelLast2;
    public Label LabelDiscord2;
    public Label LabelMain2;
    public Label LabelFirst3;
    public Label LabelLast3;
    public Label LabelDiscord3;
    public Label LabelMain3;
    public Button addingfriend;
    public Button addingfriend2;
    public Button addingfriend3;
    public Button unfriendo;
    public Button unfriendo2;
    public Button unfriendo3;

    // Main Menu
    //public ListView<String> GameList = new ListView<>();
    public Button loader;

    /*public void displaygames(MouseEvent mouseEvent) {
        String selected = "";
        selected = GameList.getSelectionModel().getSelectedItem();
    }*/
    //Genshin section

    public void refreshfromsave() throws IOException {
        FileReader fr = new FileReader("FriendsList.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> poop = new ArrayList<>();
        while((line = br.readLine()) != null){
            poop.add(line);
        }
        br.close();
        for(int i = 0; i < poop.size(); i++){
            if(poop.get(i).equals("-------------------------------------------------")){
                //EmptyFriendsList.add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
                emptyFriendsList.getItems().add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
            }
        }
        loader.setDisable(true);
    }



    /*public static void uploadListToSave() throws IOException {
        FileWriter fw = new FileWriter("FriendsList.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            bw.write("-------------------------------------------------\r"+EmptyFriendsList.get(i).first+"\r"+EmptyFriendsList.get(i).last+"\r"+EmptyFriendsList.get(i).getDiscord()+"\r"+EmptyFriendsList.get(i).getMain()+"\r");
        }
        bw.close();
    }*/

    public void uploadListToSave() throws IOException {
        FileWriter fw = new FileWriter("FriendsList.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Friendo randy;
        for(int i = 0; i < emptyFriendsList.getItems().size(); i++){
            bw.write("-------------------------------------------------\r"+emptyFriendsList.getItems().get(i).first+"\r"+emptyFriendsList.getItems().get(i).last+"\r"+emptyFriendsList.getItems().get(i).getDiscord()+"\r"+emptyFriendsList.getItems().get(i).getMain()+"\r");
        }
        bw.close();
    }

    /*public void uploadListToApp() {
        emptyFriendsList = new ListView<>();
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            String f = EmptyFriendsList.get(i).first;
            String l = EmptyFriendsList.get(i).last;
            String d = EmptyFriendsList.get(i).getDiscord();
            String m = EmptyFriendsList.get(i).getMain();
            Friendo rando = new Friendo(f,l,d,m);
            emptyFriendsList.getItems().add(rando);
        }
    }*/

    public void addFriendo(ActionEvent actionEvent) throws IOException {
        if(!(textGetFirst.getText().equals("")) && !(textGetLast.getText().equals("")) && !(textGetDiscord.getText().equals("")) && !(textGetMain.getText().equals(""))) {
            if (loader.isDisabled() != true) {
                refreshfromsave();
                refreshfromsave2();
                refreshfromsave3();
            }

            String F = textGetFirst.getText();
            String L = textGetLast.getText();
            String D = textGetDiscord.getText();
            String M = textGetMain.getText();
            //EmptyFriendsList.add(new Friendo(F,L,D,M));
            emptyFriendsList.getItems().add(new Friendo(F, L, D, M));
            uploadListToSave();
            textGetDiscord.clear();
            textGetFirst.clear();
            textGetLast.clear();
            textGetMain.clear();
            unfriendo.setDisable(true);
        }
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

    public void unfriend(ActionEvent actionEvent) throws IOException {
        Friendo rando;
        rando = emptyFriendsList.getSelectionModel().getSelectedItem();
        LabelDiscord.setText("");
        LabelFirst.setText("");
        LabelLast.setText("");
        LabelMain.setText("");
        /*ArrayList<Friendo> dupesClause = new ArrayList<>();
        int h = dupesClause.indexOf(rando);
        for(int z = 0; z < h; z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }

        for(int z = h+1; z < EmptyFriendsList.size(); z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }
        EmptyFriendsList = dupesClause;*/
        emptyFriendsList.getItems().remove(rando);
        uploadListToSave();
        unfriendo.setDisable(true);
    }

    public void loadsaves(ActionEvent actionEvent) throws IOException {
        refreshfromsave();
        refreshfromsave2();
        refreshfromsave3();
    }

    // Super Smash Bros Section
    public void refreshfromsave2() throws IOException {
        FileReader fr = new FileReader("FriendsList2.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> poop = new ArrayList<>();
        while((line = br.readLine()) != null){
            poop.add(line);
        }
        br.close();
        for(int i = 0; i < poop.size(); i++){
            if(poop.get(i).equals("-------------------------------------------------")){
                //EmptyFriendsList.add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
                emptyFriendsList2.getItems().add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
            }
        }
        loader.setDisable(true);
    }



    /*public static void uploadListToSave() throws IOException {
        FileWriter fw = new FileWriter("FriendsList.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            bw.write("-------------------------------------------------\r"+EmptyFriendsList.get(i).first+"\r"+EmptyFriendsList.get(i).last+"\r"+EmptyFriendsList.get(i).getDiscord()+"\r"+EmptyFriendsList.get(i).getMain()+"\r");
        }
        bw.close();
    }*/

    public void uploadListToSave2() throws IOException {
        FileWriter fw = new FileWriter("FriendsList2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Friendo randy;
        for(int i = 0; i < emptyFriendsList2.getItems().size(); i++){
            bw.write("-------------------------------------------------\r"+emptyFriendsList2.getItems().get(i).first+"\r"+emptyFriendsList2.getItems().get(i).last+"\r"+emptyFriendsList2.getItems().get(i).getDiscord()+"\r"+emptyFriendsList2.getItems().get(i).getMain()+"\r");
        }
        bw.close();
    }

    /*public void uploadListToApp() {
        emptyFriendsList = new ListView<>();
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            String f = EmptyFriendsList.get(i).first;
            String l = EmptyFriendsList.get(i).last;
            String d = EmptyFriendsList.get(i).getDiscord();
            String m = EmptyFriendsList.get(i).getMain();
            Friendo rando = new Friendo(f,l,d,m);
            emptyFriendsList.getItems().add(rando);
        }
    }*/

    public void addFriendo2(ActionEvent actionEvent) throws IOException {
        if(!(textGetFirst.getText().equals("")) && !(textGetLast.getText().equals("")) && !(textGetDiscord.getText().equals("")) && !(textGetMain.getText().equals(""))) {
            if (loader.isDisabled() != true) {
                refreshfromsave();
                refreshfromsave2();
                refreshfromsave3();
            }

            String F = textGetFirst.getText();
            String L = textGetLast.getText();
            String D = textGetDiscord.getText();
            String M = textGetMain.getText();
            //EmptyFriendsList.add(new Friendo(F,L,D,M));
            emptyFriendsList2.getItems().add(new Friendo(F, L, D, M));
            uploadListToSave2();
            textGetDiscord.clear();
            textGetFirst.clear();
            textGetLast.clear();
            textGetMain.clear();
            unfriendo2.setDisable(true);
        }
    }

    public void displayDeTails2(MouseEvent mouseEvent) {
        Friendo rando;
        rando = emptyFriendsList2.getSelectionModel().getSelectedItem();
        LabelDiscord2.setText(rando.getDiscord());
        LabelFirst2.setText(rando.first);
        LabelLast2.setText(rando.last);
        LabelMain2.setText(rando.getMain());
        unfriendo2.setDisable(false);
    }

    public void unfriend2(ActionEvent actionEvent) throws IOException {
        Friendo rando;
        rando = emptyFriendsList2.getSelectionModel().getSelectedItem();
        LabelDiscord2.setText("");
        LabelFirst2.setText("");
        LabelLast2.setText("");
        LabelMain2.setText("");
        /*ArrayList<Friendo> dupesClause = new ArrayList<>();
        int h = dupesClause.indexOf(rando);
        for(int z = 0; z < h; z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }

        for(int z = h+1; z < EmptyFriendsList.size(); z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }
        EmptyFriendsList = dupesClause;*/
        emptyFriendsList2.getItems().remove(rando);
        uploadListToSave2();
        unfriendo2.setDisable(true);
    }

    public void refreshfromsave3() throws IOException {
        FileReader fr = new FileReader("FriendsList3.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> poop = new ArrayList<>();
        while((line = br.readLine()) != null){
            poop.add(line);
        }
        br.close();
        for(int i = 0; i < poop.size(); i++){
            if(poop.get(i).equals("-------------------------------------------------")){
                //EmptyFriendsList.add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
                emptyFriendsList3.getItems().add(new Friendo(poop.get(i+1),poop.get(i+2),poop.get(i+3),poop.get(i+4)));
            }
        }
        loader.setDisable(true);
    }



    /*public static void uploadListToSave() throws IOException {
        FileWriter fw = new FileWriter("FriendsList.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            bw.write("-------------------------------------------------\r"+EmptyFriendsList.get(i).first+"\r"+EmptyFriendsList.get(i).last+"\r"+EmptyFriendsList.get(i).getDiscord()+"\r"+EmptyFriendsList.get(i).getMain()+"\r");
        }
        bw.close();
    }*/

    public void uploadListToSave3() throws IOException {
        FileWriter fw = new FileWriter("FriendsList3.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Friendo randy;
        for(int i = 0; i < emptyFriendsList3.getItems().size(); i++){
            bw.write("-------------------------------------------------\r"+emptyFriendsList3.getItems().get(i).first+"\r"+emptyFriendsList3.getItems().get(i).last+"\r"+emptyFriendsList3.getItems().get(i).getDiscord()+"\r"+emptyFriendsList3.getItems().get(i).getMain()+"\r");
        }
        bw.close();
    }

    /*public void uploadListToApp() {
        emptyFriendsList = new ListView<>();
        for(int i = 0; i < EmptyFriendsList.size(); i++){
            String f = EmptyFriendsList.get(i).first;
            String l = EmptyFriendsList.get(i).last;
            String d = EmptyFriendsList.get(i).getDiscord();
            String m = EmptyFriendsList.get(i).getMain();
            Friendo rando = new Friendo(f,l,d,m);
            emptyFriendsList.getItems().add(rando);
        }
    }*/

    public void addFriendo3(ActionEvent actionEvent) throws IOException {
        if(!(textGetFirst.getText().equals("")) && !(textGetLast.getText().equals("")) && !(textGetDiscord.getText().equals("")) && !(textGetMain.getText().equals(""))) {
            if (loader.isDisabled() != true) {
                refreshfromsave();
                refreshfromsave2();
                refreshfromsave3();
            }

            String F = textGetFirst.getText();
            String L = textGetLast.getText();
            String D = textGetDiscord.getText();
            String M = textGetMain.getText();
            //EmptyFriendsList.add(new Friendo(F,L,D,M));
            emptyFriendsList3.getItems().add(new Friendo(F, L, D, M));
            uploadListToSave3();
            textGetDiscord.clear();
            textGetFirst.clear();
            textGetLast.clear();
            textGetMain.clear();
            unfriendo3.setDisable(true);
        }
    }

    public void displayDeTails3(MouseEvent mouseEvent) {
        Friendo rando;
        rando = emptyFriendsList3.getSelectionModel().getSelectedItem();
        LabelDiscord3.setText(rando.getDiscord());
        LabelFirst3.setText(rando.first);
        LabelLast3.setText(rando.last);
        LabelMain3.setText(rando.getMain());
        unfriendo3.setDisable(false);
    }

    public void unfriend3(ActionEvent actionEvent) throws IOException {
        Friendo rando;
        rando = emptyFriendsList3.getSelectionModel().getSelectedItem();
        LabelDiscord3.setText("");
        LabelFirst3.setText("");
        LabelLast3.setText("");
        LabelMain3.setText("");
        /*ArrayList<Friendo> dupesClause = new ArrayList<>();
        int h = dupesClause.indexOf(rando);
        for(int z = 0; z < h; z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }

        for(int z = h+1; z < EmptyFriendsList.size(); z++){
            String F = EmptyFriendsList.get(z).first;
            String L = EmptyFriendsList.get(z).last;
            String D = EmptyFriendsList.get(z).getDiscord();
            String M = EmptyFriendsList.get(z).getMain();
            Friendo randos = new Friendo(F,L,D,M);
            dupesClause.add(randos);
        }
        EmptyFriendsList = dupesClause;*/
        emptyFriendsList3.getItems().remove(rando);
        uploadListToSave3();
        unfriendo3.setDisable(true);
    }
}