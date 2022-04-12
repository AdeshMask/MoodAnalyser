import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {

//    @Test
//    public void analyseMood1() {
//        MoodAnalyser1 check = new MoodAnalyser1();
//        boolean result = check.analyseMood1("happy");
//        Assert.assertEquals(true, result);
//    }
//
//    @Test
//    public void givenSad_ReturnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
//        String result = moodAnalyser.analyseMood();
//        String expected = "sad";
//        Assert.assertEquals(expected,result);
//    }
//    @Test
//    public void givenAny_ReturnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
//        String result = moodAnalyser.analyseMood();
//        String expected = "Happy";
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void givenNull_ReturnInvalid() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
//        String result = moodAnalyser.analyseMood();
//        String expected = null;
//        Assert.assertEquals(expected,result);
//
//    }
//
//    @Test
//    public void givenNull_ReturnhAPPY() throws MoodAnalysisException {
//        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
//        String result = moodAnalyser.analyseMood();
//        String expected = "Happy(null)";
//        assertEquals(expected,result);
//    }

    @Test
    public void nullOrEmpty_InvalidMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = moodAnalyser.analyseMood();
        String expected = "";
        assertEquals("",result);
    }
}