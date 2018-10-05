import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JTextArea;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HtmlAnalysis
{
	String html;
	String Size = "100";
	JTextArea textArea;

	public HtmlAnalysis(String x, String y, JTextArea z)
	{
		html = x;
		Size = y;
		textArea = z;
	}
	public void createProducts() throws IOException, URISyntaxException
	{

		  //System.out.println(html);


		  String element1 = null;
		  String jsonString;

		  	Document doc = Jsoup.connect(html).get();
		  	//Document doc = Jsoup.parse(html);//parsing original HTML using Jsoup
		  	String title = doc.select("head > title").first().text(); //title of the webpage
			Elements element = doc.getElementsByClass("MasterContent js-content");// getting the element containing the JSON script using the class name
			String eleText=element.toString();//converting the element into text
			Document doc2 = Jsoup.parse(eleText);// parse the text containing the JSON script
			//System.out.println("This is doc: "+doc2);
			Elements ele1 = doc2.getElementsByTag("script"); //this gets the JSON script from the text
			element1 = ele1.toString().substring(56); //this makes the script have the correct syntax removing parts from the beginning and end
	        element1 = element1.substring(0, element1.length() -9 );





	        //This builds the Gson parser
          jsonString = element1;
          GsonBuilder builder = new GsonBuilder();
          builder.setPrettyPrinting();
          Gson gson = builder.setLenient().create();
          Result result = gson.fromJson(jsonString, Result.class);


          //loops through all variants and grabs their data and then outputs it to the console
          System.out.println();
          System.out.println(title);
        String test = "100";
          if(result!=null)
          {
        	for(Variant v : result.getVariants())
        	{
        		String id = v.getOption1();
        		textArea.append("Size "+id + "   Link: https://yeezysupply.com/cart/"+v.getId()+":1 \n");
        		//System.out.println("Size "+id + "   Link: https://yeezysupply.com/cart/"+v.getId()+":1 ´\n´");
        		
        		if(id.equals(Size)&&!test.equals(Size))
        		{
        			String url="";
        			url = url+"https://yeezysupply.com/cart/"+v.getId()+":1";
        			Desktop d = Desktop.getDesktop();
        			d.browse(new URL(url).toURI());
        		}



        	}
          }
          System.out.println();





	}

}
