import java.net.*;
import java.io.*;

public class UF3ACT2 {
	
	public static void main (String[] args) {
		URL url=null;
		
		try {
			
			url = new URL("http://www.insbaixcamp.cat/moodle/");
			
		} catch (MalformedURLException e) {e.printStackTrace(); }
		
		BufferedReader in;
		
		try {
			
			InputStream inputStream = url.openStream();
			in = new BufferedReader(new InputStreamReader(inputStream));
			
			String inputLine;
			
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
			
		} catch (IOException e) {e.printStackTrace(); }

	}
}