package com.example.friends;

public class Friendo {
    public String first;
    public String last;
    private String discord;
    private String CharMain;

    Friendo(String first, String last, String discord, String CharMain){
        this.discord = discord;
        this.first = first;
        this.last = last;
        this.CharMain = CharMain;
    }
    public void setMain(String Char){
        this.CharMain = Char;
    }

    public String getMain(){
        return this.CharMain;
    }

    public void setDiscord(String discord){
        this.discord = discord;
    }

    public String getDiscord(){
        return this.discord;
    }

    public String toString(){
        return first+" "+last;
    }
}
