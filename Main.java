import java.io.*;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Arrays;

public class Main {

    public static String htmlContent;

    public static void main(String[] args) {

        SuspiciousWords myList = new SuspiciousWords();

        try {
            
            GetHtmlContent(args[0], htmlContent);

            if(Arrays.stream(myList.getWordsList()).anyMatch(htmlContent::contains)) {
                System.out.println("suspicious");
            } else {
                System.out.println("safe");
            };
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    private static String GetHtmlContent(String siteUrl, String htmlData) {
        URL url;
        HttpURLConnection connection;
        BufferedReader reader; 
        String lines; 
        
        try {
            url = new URL(siteUrl);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    
            while ((lines = reader.readLine()) != null) {
                htmlData += lines;
            }
            reader.close();
        } catch(Exception error) {
            error.printStackTrace();
        }

        return htmlContent = htmlData;
    }
}
