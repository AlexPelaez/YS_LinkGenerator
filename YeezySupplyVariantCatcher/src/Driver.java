import java.io.IOException;
import java.net.URISyntaxException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Driver {
	public static String htmlText = "";
	public static String url = "file:///Users/Alex/Desktop/YEEZY%20SUPPLY700%20release.htm";
	public static String size = "";
	//public static void main(String[] args) throws IOException, URISyntaxException 
	{
		long startTime = System.currentTimeMillis();

		
		
		System.out.println("Starting");
		//HtmlAnalysis HA = new HtmlAnalysis("https://yeezysupply.com/");
		//HA.createProducts();
		System.out.println("Completed HTML and JSON analysis");
		
		
		
		
		
		
		
		
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}

	
		
	


