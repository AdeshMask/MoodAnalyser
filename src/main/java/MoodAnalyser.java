
public class MoodAnalyser {
    public String message;

    public MoodAnalyser(){
    };
    public MoodAnalyser(String message){
        this.message = message;
        }
    public  String analyseMood() {
        try {
            if(this.message.toLowerCase().contains("sad")) {
                return "sad";
            }
            else {
                return  "Happy";
            }
        } catch (NullPointerException e) {
                return "Happy(null)";
        }
    }
}
