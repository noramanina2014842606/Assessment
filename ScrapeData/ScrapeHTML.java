import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import org.jsoup.Jsoup;
import java.io.*;

import java.io.IOException;
import java.util.*;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class ScrapeHTML
{
 
  public static void main(String[] args) throws IOException {
  
      Document doc = null;
      String title = null;
     
      try 
      {
        doc = Jsoup.connect("http://fskm.uitm.edu.my/v1/fakulti/staff-directory/academic/1097.html").get();
        title = doc.title();
        System.out.println("title: " + title);
      
     
      Element tables = doc.getElementById("mytable");
      Elements rows = tables.getElementsByTag("tr");
      for (Element row : rows){
          Elements tds = row.getElementsByTag("td");
          for (int i = 0; i < tds.size(); i++) {
                    if (i == 1) System.out.println(tds.get(i).text());
                }
      }
        
            }catch (java.io.IOException ex) {
            System.out.println("IO Error: " + ex);
        }  
    
       
    }
            }  
  
