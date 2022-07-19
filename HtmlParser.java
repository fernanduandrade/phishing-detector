import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HtmlParser {
	public String GetHtmlContent(String url) {
		BufferedReader reader; 
        String htmlContent = "";
        
		try {
			String lines;
        	URL uri = new URL(url);
        	HttpURLConnection connection = (HttpURLConnection) uri.openConnection();
            connection.setRequestMethod("GET");
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    
            while ((lines = reader.readLine()) != null) {
            	htmlContent += lines;
            }
            reader.close();
        } catch(Exception error) {
            error.printStackTrace();
        }
		
		return htmlContent;
	}
}
