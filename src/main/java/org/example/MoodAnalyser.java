package org.example;

public class MoodAnalyser {
    public static String analyseMood(String message){
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