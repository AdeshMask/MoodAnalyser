
public class MoodAnalyser {
    public String message;

    public MoodAnalyser(){
    };
    public MoodAnalyser(String message){
        this.message = message;
        }
    public  String analyseMood() {
        if(this.message.toLowerCase().contains("sad")) {
            return "sad";
        }
        else {
            return  "Happy";
        }
    }
}
