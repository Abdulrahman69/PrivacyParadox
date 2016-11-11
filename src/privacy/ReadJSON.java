/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package privacy;

import java.util.ArrayList;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdulrahman_69
 */
public class ReadJSON {
    
    
	 public static double lng ; 
         public static double lat ; 
          public ReadJSON( )
         {
             
         }
 
     public   String ReturnJson(double lng , double lat,int meter,String type){
          try{
              String Service =null; 
            if (meter >=500 && meter <=50000){ 
                switch (type) {
                    case "food":
                        Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius="+meter+"&language=ar&types=food&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";
                        break;
                    case "mosque":
                        Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius="+meter+"&language=ar&types=mosque&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";
                        break;
                    case "bank":
                        Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius="+meter+"&language=ar&types=bank&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";
                        break;
                    case "hospital":     
                        Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius="+meter+"&language=ar&types=hospital&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";
                        break;  
                    default:
                       Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius="+meter+"&language=ar&types=hospital&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";
                }
            }else {
               Service ="https://maps.googleapis.com/maps/api/place/nearbysearch/json?location="+lng+","+lat+"&radius=10000&language=ar&types=food&sensor=true&key=AIzaSyDuQJDY4Ym5CgyDdUa7s6TQzO5wKRKFrgE";        
            }
            URL url= new URL(Service);
            Scanner s= new Scanner(url.openStream());
            String Res="";
            while(s.hasNext())Res+=s.next();
              return Res;  
          }catch(Exception e){e.printStackTrace();}
          return null;
  }
	 public   ArrayList<data> dataToJason(double lng , double lat,int meter,String type)
	 {
		  String JsonResult = ReturnJson(lng,lat,meter,type);  
		  JsonElement root = new JsonParser().parse(JsonResult);
		  JsonObject value = root.getAsJsonObject();
		  JsonArray Data = value.getAsJsonArray("results");
		  ArrayList<data> item = new ArrayList<data>() ;  
		  for (int i=0;i<Data.size() ;i++){	 
                          data info = new data() ;
			  JsonObject name = Data.get(i).getAsJsonObject();
			  info.name=name.get("name").toString();
			  info.vicinity=name.get("vicinity").toString();
			  info.icon=name.get("icon").toString();
	                  info.rating= name.get("rating").getAsInt();
                          System.out.println(info.name);
	                  item.add(info); 
                       
		  }
		 return item ;
	 }
     public static void main (String []args) throws MalformedURLException{
              
                   
 		  System.out.println("");
		  ArrayList<data> u = new ReadJSON().dataToJason(Home.new_info.work.Lat,Home.new_info.work.Lng,54,"") ; 
		  for (int i=0; i<u.size();i++)
		  {
			  System.out.println(u.get(i).name);
			  System.out.println(u.get(i).vicinity);
			  System.out.println(u.get(i).rating);
		  }                   
	  }
}
