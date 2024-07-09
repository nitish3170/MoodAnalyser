package org.example;

public class MoodAnalyser {
    private String message;

    MoodAnalyser(){
    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood(){

        try {
            message=message.toLowerCase();
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("happy")) {
                return "HAPPY";
            }
            return "";
        }
        catch (NullPointerException e){
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
    }
}