import java.util.Scanner;

public class MoodAnalyser {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println("Enter Message:");
        String message = scanner.nextLine();
        System.out.println(moodAnalyser.analyseMood(message));

    }

    private String analyseMood(String message) {
        String str = "Sad";
        if (str== message)
            return str;
        else return message;
    }
}
