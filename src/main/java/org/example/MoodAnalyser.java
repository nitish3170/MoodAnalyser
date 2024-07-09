package org.example;

//enum Mood{
//    HAPPY,SAD,EMPTY,NULL
//}
public class MoodAnalyser {
    private String message;

    MoodAnalyser(){
    }
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood() throws CustomException {
        try {
            if(message.isEmpty()){
                throw new CustomException(CustomException.ExceptionType.EMPTY, "Empty String");
            }
            message = message.toLowerCase();
            if (message.contains("sad")) {
                return "SAD";
            } else if (message.contains("happy")) {
                return "HAPPY";
            }
            return "";
        } catch (NullPointerException e) {
            throw new CustomException(CustomException.ExceptionType.NULL, "NULL String");
        }
    }
    public static void main(String[] args) {
    }
}