package privacy;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import twitter4j.FilterQuery;
import twitter4j.PagableResponseList;
import twitter4j.Paging;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saad
 */

public class Twitter_ {
         String  ConsumerKey ="lzVYIDmpCUtUx6wWeYgug" ; 
         String  ConsumerSecret ="kcODiYMWsNeRoGMvgftn9KvDRL5sSnzkOoCmirGPjbg" ; 
	String  accesstoken ="519782936-Y2dQY35Whg0neXFffUy0dqZCG7sazlDlYwFJCvMG"; 
	String  AccessTokenSecret ="ghqixgpyBmpH4h7ih3bY7pAFz9J8fkG9IH8nyYlBRJFqO" ; 
     
     public Twitter_(){
          ConsumerKey ="lzVYIDmpCUtUx6wWeYgug" ; 
	 ConsumerSecret ="kcODiYMWsNeRoGMvgftn9KvDRL5sSnzkOoCmirGPjbg" ; 
	 accesstoken ="519782936-Y2dQY35Whg0neXFffUy0dqZCG7sazlDlYwFJCvMG"; 
	 AccessTokenSecret ="ghqixgpyBmpH4h7ih3bY7pAFz9J8fkG9IH8nyYlBRJFqO" ; 
     }
  
    public static Location[] MostOccureLocation(ArrayList<AllData> al){
        Location tmp [] = new Location[al.size()];
        ArrayList<AllData> tmpp = new ArrayList<>();
        for(int n=0; n<al.size();n++){
            tmpp.add(new AllData(al.get(n)));
        }
      int  tmpcount=0;
        Location LL = new Location();
         int count =0; 
      for(int i=0; i<tmpp.size();i++){
          if(tmpp.get(i)!=null&&tmpp.get(i).getLongitude()!=0.0){    
          LL.longirude =tmpp.get(i).longitude ;
        LL.latitude =tmpp.get(i).latitude;
                     int countj=0;
        for(int j=i+1; j<tmpp.size();j++){
            if(tmpp.get(j)!=null&&tmpp.get(j).longitude==LL.longirude&&tmpp.get(j).latitude==LL.latitude){
               tmpp.remove(j);
                count++; 
                  }
        countj++;
        }
              if(count==0){
                  continue;}
       LL.occure =count;
        count=0; 
        if(tmp[0]==null)
      tmp[tmpcount++]= new Location(LL);
        else{
            Location tmpl = new Location();
            for(int jj=0;jj<tmpcount;jj++){
              if(tmp[jj]!=null&&tmp[jj].occure<LL.occure) {
             tmpl = tmp[jj];
             tmp[jj] = new Location(LL);
           
            tmp[tmpcount++] = new Location(tmpl);
             jj = tmpcount+1;
               }
               if(jj==tmpcount-1)
                  tmp[tmpcount++] = new Location();
            }
        }
          
          } 
          }
      Location MaxOccure[] = new Location[5];
         Location max1 = new Location();
       Location max2 = new Location();
        Location max3 = new Location();
         Location max4 = new Location();
          Location max5 = new Location();
          max1 = tmp[0];
          max2.occure =0;
          max3.occure =0;
          max4.occure =0;
          max5.occure = 0;
          
      for(int i=1; i<tmpcount;i++){
          
          if(tmp[i].occure>max1.occure)
              max1 = tmp[i];
              if(tmp[i].occure<max1.occure &&tmp[i].occure>max2.occure)
                  max2=tmp[i];
           if(tmp[i].occure<max2.occure &&tmp[i].occure>max3.occure)
                  max3=tmp[i];
                if(tmp[i].occure<max3.occure &&tmp[i].occure>max4.occure)
                  max4=tmp[i];
                 if(tmp[i].occure<max4.occure &&tmp[i].occure>max5.occure)
                  max5=tmp[i];
         
      }
      MaxOccure[0]=new Location(max1);  MaxOccure[1]=new Location(max2);  MaxOccure[2]=new Location(max3);
        MaxOccure[3]=new Location(max4);  MaxOccure[4]=new Location(max5);
        return MaxOccure;  
    }
    public Twitter_(String conKey , String ConSec, String acctoken, String acctokSecret){
      this.ConsumerKey = conKey;
      this.ConsumerSecret = ConSec;
      this.accesstoken = acctoken;
      this.AccessTokenSecret = acctokSecret;
  }
 public twitter4j.Twitter Connection_with_twitter4j()throws twitter4j.TwitterException{
     try{      
ConfigurationBuilder cb = new ConfigurationBuilder();
cb.setOAuthConsumerKey(ConsumerKey);
cb.setOAuthConsumerSecret(ConsumerSecret);
cb.setOAuthAccessToken(accesstoken);
cb.setOAuthAccessTokenSecret(AccessTokenSecret);
  final twitter4j.Twitter twitter = new TwitterFactory(cb.build()).getInstance();
return  twitter;
      }catch(Exception e ){
          System.out.println("Couldn't Connect with Twitter API");
      }
              return null;
      
 }
 
  public twitter4j.TwitterStream Connection_with_twitter4jStream()throws twitter4j.TwitterException{
     try{      
       ConfigurationBuilder cb = new ConfigurationBuilder(); 
       cb.setDebugEnabled(true); 
        cb.setOAuthConsumerKey(ConsumerKey); 
        cb.setOAuthConsumerSecret(ConsumerSecret); 
        cb.setOAuthAccessToken(accesstoken); 
        cb.setOAuthAccessTokenSecret(AccessTokenSecret);  
        final TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
        
return  twitterStream;
      }catch(Exception e ){
          System.out.println("Couldn't Connect with Twitter API");
      }
              return null;
      
 }
  
public Information_ Indivual_Streaming(String username) throws TwitterException, SQLException{
    DecimalFormat f = new DecimalFormat("#.000000");
f.setMaximumFractionDigits(6);
      int x =0;
      int mm =0;
      int mpv =0;
       
    System.out.println("Start.....");
    Information_ I = new Information_();
    I.countRetweeted = 0;
    I.pt.sportInterest =0;
     	   ArrayList<AllData> Ald = new ArrayList<>();
            AllData ad = new AllData();
   
      
      final Twitter twitter =  Connection_with_twitter4j();
     
     
    long cursor = -1;
        List<Status> statuses = null;
        Status test = null;
        User user ;
        int i=1;
        int page;
        int count =0;
       
        int ratelimit = twitter.getUserTimeline().getRateLimitStatus().getRemaining();
       // for (int n=0;n<str.length;n++) {
        	while(true){
        		try{
        		while(true){
            		try{
            				user = twitter.showUser(username);
            				if(user.getRateLimitStatus().getRemaining()<2){
            				System.out.println(user.getRateLimitStatus().getSecondsUntilReset());
            				Sleep(user.getRateLimitStatus().getSecondsUntilReset()+10);
            				}
            			break;
            		}catch(Exception e){
            		                 System.out.println("catch 1");
                                         System.exit(0);
            		}
        		}
        		if(!user.isProtected()){
        		System.out.println("Username:  " + username);
        		page = 1;
        			while(true){
        				if(ratelimit<2){
        					int seconds = twitter.getUserTimeline().getRateLimitStatus().getSecondsUntilReset();
        					System.out.println("The program is gonna sleep for " +seconds+ " seconds");
        					Sleep(seconds+10);
        					ratelimit = twitter.getUserTimeline().getRateLimitStatus().getRemaining();
        		}
        		statuses = twitter.getUserTimeline(username, new Paging(page++, 200));
        		ratelimit--;
           
                  if(statuses.size() == 0){
                
            	break;}
                  
            for (Status s : statuses) {
                if(mm==0){
                    I.Describtion = s.getUser().getDescription();
                     I.Device   = s.getSource();

                       if(I.Device.contains("Android"))
                                                 I.Device = "Android";
                                             else if(I.Device.contains("Iphone"))
                                                 I.Device = "Iphone";
                                             else if(I.Device.contains("BlackBerry"))
                                                 I.Device = "BlackBerry";
                                             else
                                                 I.Device= "PC";
                       I.tweetscount = s.getUser().getStatusesCount();
                       I.followers = s.getUser().getFollowersCount();
                       I.following = s.getUser().getFriendsCount();
                       I.CreatedAt =""+ s.getUser().getCreatedAt();
                       
                mm=2;
                
                }// end of if m == 0
                count++;
                ad.day = s.getCreatedAt().getDay();
                if(s.isRetweet())
                    I.countRetweeted++;
                if(s.isFavorited())
                    I.countFavorite++;
                if (I.t.CountRetweeted < s.getRetweetCount()&&(!s.isRetweet())){
                    I.t.CountRetweeted=s.getRetweetCount();
                    I.t.mostRetweetedTweet = s.getText();
                }
                if(I.t.countFavorited < s.getFavoriteCount()){
                    I.t.countFavorited = s.getFavoriteCount();
                    I.t.MostFavoritedTweet = s.getText();
                }
                
                ad.hours = s.getCreatedAt().getHours();
               
               if(s.getGeoLocation()!=null){
                   
                   ad.latitude = Double.parseDouble( f.format(s.getGeoLocation().getLongitude()));
                     ad.longitude = Double.parseDouble(f.format(s.getGeoLocation().getLatitude()));
                   
                     I.tweetsWithGps++;
               }
                  else
                       {
                   ad.longitude = 0.0;
                   ad.latitude = 0.0;
               }
                Ald.add(new AllData(ad));
              
            }
    
                           }
      
        	}
        	break;
        	}catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        }

 Location []l;
 I.tweetsWeRetrive = Ald.size();
        if(I.tweetsWithGps>400){
       
            l =  MostOccureLocation(Ald);
        
       int loca1countInhomeRange =0;
       int loca2countInhomeRange =0;
       int loca3countInhomeRange = 0;
       int loca4countInhomeRange = 0;
      int  loca5countInhomeRange =0;
       int loca1countInworkRange =0;
       int loca2countInworkRange =0;
       int loca3countInworkRange = 0;
       int loca4countInworkRange = 0;
      int  loca5countInworkRange =0;
      
       
          for(int cc=0; cc<Ald.size();cc++){

               if(l[0].longirude==Ald.get(cc).longitude&&l[0].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14)){
                   loca1countInhomeRange++;
                     }
                  else if(l[1].longirude==Ald.get(cc).longitude&&l[1].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14)){
                   loca2countInhomeRange++;
                      }   
                  else if(l[2].longirude==Ald.get(cc).longitude&&l[2].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14)){
                   loca3countInhomeRange++;
                      } 
                  else if(l[3].longirude==Ald.get(cc).longitude&&l[3].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14)){
                   loca4countInhomeRange++;
                      }   
                  else if(l[4].longirude==Ald.get(cc).longitude&&l[4].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14)){
                   loca5countInhomeRange++;
                      }
                   
          }
              
      
               Location home = new Location();
               Location work = new Location();
               if(loca1countInhomeRange>loca2countInhomeRange&&loca1countInhomeRange>loca3countInhomeRange&&loca1countInhomeRange>loca4countInhomeRange&&loca1countInhomeRange>loca5countInhomeRange){
                   home.longirude = l[0].longirude;
               home.latitude = l[0].latitude;
               home.occure = loca1countInhomeRange;
               l[0]=null;
               }else if(loca2countInhomeRange>loca3countInhomeRange&&loca2countInhomeRange>loca4countInhomeRange&&loca2countInhomeRange>loca5countInhomeRange){
                    home.longirude = l[1].longirude;
               home.latitude = l[1].latitude;  
               home.occure = loca2countInhomeRange;
               l[1]=null;
               }
               else if(loca3countInhomeRange>loca4countInhomeRange&&loca3countInhomeRange>loca4countInhomeRange){
                   home.longirude = l[2].longirude;
               home.latitude = l[2].latitude;  
               home.occure = loca3countInhomeRange;
               l[2]=null;
               }
               else if(loca4countInhomeRange>loca5countInhomeRange){
                    home.longirude = l[3].longirude;
               home.latitude = l[3].latitude;  
               home.occure = loca4countInhomeRange;
               l[3]=null;
               }
               else{
                     home.longirude = l[4].longirude;
               home.latitude = l[4].latitude; 
               home.occure = loca5countInhomeRange;
               l[4]=null;
               }
               
               
               I.home.Lat=home.latitude;
               I.home.Lng = home.longirude;
               
               for(int cc=0; cc<Ald.size();cc++){

                    if(l[0]!=null&&l[0].longirude==Ald.get(cc).longitude&&l[0].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>8&&Ald.get(cc).hours<14)){
                   loca1countInworkRange++;
                     }
                  else if(l[1]!=null&&l[1].longirude==Ald.get(cc).longitude&&l[1].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14&&Ald.get(cc).hours<14)){
                   loca2countInworkRange++;
                      }   
                  else if(l[2]!=null&&l[2].longirude==Ald.get(cc).longitude&&l[2].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14&&Ald.get(cc).hours<14)){
                   loca3countInworkRange++;
                      } 
                  else if(l[3]!=null&&l[3].longirude==Ald.get(cc).longitude&&l[3].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14&&Ald.get(cc).hours<14)){
                   loca4countInworkRange++;
                      }   
                  else if(l[4]!=null&&l[4].longirude==Ald.get(cc).longitude&&l[4].latitude==Ald.get(cc).latitude&&(Ald.get(cc).day>=0&&Ald.get(cc).day<=4)&&(Ald.get(cc).hours>14&&Ald.get(cc).hours<14)){
                   loca5countInworkRange++;
                      }
              
          }
               
               if(loca1countInworkRange>loca2countInworkRange&&loca1countInworkRange>loca3countInworkRange&&loca1countInworkRange>loca4countInworkRange&&loca1countInworkRange>loca5countInworkRange){
                   work.longirude = l[0].longirude;
               work.latitude = l[0].latitude;
               work.occure = loca1countInhomeRange;
               l[0]=null;
               }else if(loca2countInworkRange>loca3countInworkRange&&loca2countInworkRange>loca4countInworkRange&&loca2countInworkRange>loca5countInworkRange){
                    work.longirude = l[1].longirude;
               work.latitude = l[1].latitude;  
               work.occure = loca2countInhomeRange;
               l[1]=null;
               }
               else if(loca3countInworkRange>loca4countInworkRange&&loca3countInworkRange>loca4countInworkRange){
                   work.longirude = l[2].longirude;
               work.latitude = l[2].latitude;  
               work.occure = loca3countInhomeRange;
               l[2]=null;
               }
               else if(loca4countInworkRange>loca5countInworkRange){
                    work.longirude = l[3].longirude;
               work.latitude = l[3].latitude;  
               work.occure = loca4countInhomeRange;
               l[3]=null;
               }
               else{
                     work.longirude = l[4].longirude;
               work.latitude = l[4].latitude; 
               work.occure = loca5countInhomeRange;
               l[4]=null;
               }
               I.work.Lat = work.latitude;
               I.work.Lng = work.longirude;
         
        
         
               // Most Hour & Day 
               
               
                int popularday = Ald.get(0).day;
  int temp = 0;
  int tempCount;
  int countj=0;
     int popularHour = Ald.get(0).hours;
  int temp2 = 0;
  int tempCount2;
  int countj2=0;
                      for(int nn=0; nn<Ald.size()-1;nn++){
           temp = Ald.get(nn).day;
    tempCount = 0;
      temp2 = Ald.get(nn).hours;
    tempCount2 = 0;
    for (int k = 1+nn; k < Ald.size(); k++)
    {
      if (temp == Ald.get(k).day)
        tempCount++;
      if (temp2 == Ald.get(k).hours)
        tempCount2++;
    }
    if (tempCount > countj)
    {
      popularday = temp;
      countj = tempCount;
    }
    if (tempCount2 > countj2)
    {
      popularHour = temp2;
      countj2 = tempCount2;
    }
       }
                      I.mostDay = popularday;
                      I.mostHour = popularHour;
                      // Weekend 
                      Location weekend = new Location();
        weekend.latitude = Ald.get(0).latitude;
        weekend.longirude = Ald.get(0).longitude;
        
  Location tempw = new Location();
  int tmpweekcount;
  int weekcountj=0;
       
               for(int week=0; week<Ald.size()-1;week++){
           tempw.latitude = Ald.get(week).latitude;
           tempw.longirude = Ald.get(week).longitude;
    tmpweekcount = 0;
 
    for (int k = 1+week; k < Ald.size(); k++)
    {
      if ((tempw.longirude!=0.0)&&(tempw.latitude!=I.home.Lat&&tempw.longirude!=I.home.Lng)&&tempw.latitude == Ald.get(k).latitude&&tempw.longirude==Ald.get(k).longitude)
        tmpweekcount++;
      
    }
    if (tmpweekcount > weekcountj)
    {
      weekend = new Location(tempw);
      weekcountj = tmpweekcount;
    }
   
       } 
               if(l[0]!=null){
                   I.mvp.Lat= l[0].latitude;
                   I.mvp.Lng=l[0].longirude;
               }
              else if(l[1]!=null){
                   I.mvp.Lat= l[1].latitude;
                   I.mvp.Lng=l[1].longirude;
               }
              else if(l[2]!=null){
                   I.mvp.Lat= l[2].latitude;
                   I.mvp.Lng=l[2].longirude;
               }
              else  if(l[3]!=null){
                   I.mvp.Lat= l[3].latitude;
                   I.mvp.Lng=l[3].longirude;
               }
              else  if(l[4]!=null){
                   I.mvp.Lat= l[4].latitude;
                   I.mvp.Lng=l[4].longirude;
               }
               
                   
               I.tweetsWeRetrive = count;
               I.wp.Lat = weekend.latitude;
               I.wp.Lng = weekend.longirude;
                   //System.out.println("Home\t"+"Longitude: "+home.longirude+"\tLatitude :"+home.latitude+"\tارسل من نفسل المكان :"+home.occure);
                 // System.out.println("Work\tLongitude: "+I.work.Lng+"\tlatitude :"+I.work.Lat);
                   //System.out.println("Weekend\tLongitude: "+weekend.longirude+"\tLatitude :"+weekend.latitude+"\t Occure :"+weekcountj+"times");
                   //System.out.println("Most Day tweet  "+popularday+"\tMost Hours \t"+popularHour);
                  // System.out.println(loca1countInworkRange+"\t"+loca2countInworkRange+"\t"+loca3countInworkRange);
        }
        else 
            System.out.println("Not Enable GPSLocation");
                   return I;
	}
public void Sleep(long time){
		try {
			TimeUnit.SECONDS.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


