package test;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;





public class word {
  
        
         
public static String getword (String message, Model model) throws MalformedURLException, IOException{
    
        URL url  = new URL("https://dictionary.yandex.net/api/v1/dicservice.json/lookup?key=dict.1.1.20180719T165228Z.ae37797f0067950f.9652e4e5e5c32bf36e90d9d5ac1847aef8247060&lang=en-ru&text=" +message+"");

    Scanner in = new Scanner((InputStream)url.getContent());
    String result = "";
    while(in.hasNext()){
      result += in.nextLine();
       
    
    }
   
    

            return result;
    
}
}
