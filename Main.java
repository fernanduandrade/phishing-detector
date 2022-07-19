import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        try {
        	SuspiciousWords suspiciousWords = new SuspiciousWords();
            HtmlParser htmlParser = new HtmlParser();
            
            String response = htmlParser.GetHtmlContent(args[0]);
            String result = suspiciousWords.MatchSuspiciousWords(response);
            System.out.println(result);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
