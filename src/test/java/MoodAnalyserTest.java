import org.example.CustomException;
import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void result1() throws CustomException {
        MoodAnalyser  mood =new MoodAnalyser("I am in a Sad mood");
        String result=mood.analyseMood();
            Assert.assertEquals("SAD",result);
    }
    @Test
    public void result2() throws CustomException{
        MoodAnalyser mood =new MoodAnalyser("I am in a Happy mood");
        String result=mood.analyseMood();
            Assert.assertEquals("HAPPY",result);
    }
    @Test
    public void result3() throws  CustomException{
        String result="";
        MoodAnalyser mood =new MoodAnalyser(null);
        try{
            mood.analyseMood();
        }
        catch (CustomException e){
        Assert.assertEquals(CustomException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    public void result4() throws  CustomException {
        String result = "";
        MoodAnalyser mood = new MoodAnalyser("");
        try {
            mood.analyseMood();
        }
        catch(CustomException e){
            Assert.assertEquals(CustomException.ExceptionType.EMPTY, e.type);
        }
    }
}
