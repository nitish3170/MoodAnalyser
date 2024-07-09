import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void result1(){
        MoodAnalyser  mood =new MoodAnalyser();
        String result =mood.analyseMood("I am in a Sad mood");
        Assert.assertEquals("SAD",result);
    }
    @Test
    public void result2(){
        MoodAnalyser mood =new MoodAnalyser();
        String result =mood.analyseMood("I am in a Happy mood");
        Assert.assertEquals("HAPPY",result);
    }
}
