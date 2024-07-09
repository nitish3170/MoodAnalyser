import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void result1(){
        MoodAnalyser  mood =new MoodAnalyser("I am in a Sad mood");
        String result =mood.analyseMood();
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void result2(){
        MoodAnalyser mood =new MoodAnalyser("I am in a Happy mood");
        String result =mood.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
}
