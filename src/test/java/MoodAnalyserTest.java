import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {

    @Test
    public void analyseMood1() {
        MoodAnalyser1 check = new MoodAnalyser1();
        boolean result = check.analyseMood1("happy");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenSad_ReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String result = moodAnalyser.analyseMood();
        String expected = "sad";
        Assert.assertEquals(expected,result);
    }
    @Test
    public void givenAny_ReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String result = moodAnalyser.analyseMood();
        String expected = "Happy";
        Assert.assertEquals(expected,result);
    }
}