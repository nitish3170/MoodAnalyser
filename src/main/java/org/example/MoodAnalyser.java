package org.example;

public class MoodAnalyser {
    private String message;

    MoodAnalyser(){
    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){
        if (message.contains("Sad")){
            return "SAD";
        }
        else if (message.contains("Happy")){
            return "HAPPY";
        }
        return "";
    }
    public static void main(String[] args) {
    }
}