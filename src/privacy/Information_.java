package privacy;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad
 */
public class Information_ {
     String Device;
     String Icon;
     int mostHour;
     int mostDay;
    String Describtion;
    String Device_type;
    int following;
    int followers;
    int tweetscount;
    int tweetsWithGps;
    int tweetsWeRetrive;
    String CreatedAt;
    int countRetweeted;
    int countFavorite;
     Home home = new Home();
     Work work = new Work();
     MostVistidPlaces mvp = new MostVistidPlaces();
     WeekendPlaces wp = new WeekendPlaces() ;
     Tweet t = new Tweet();
     ProcessingText pt = new ProcessingText();
    public class Home {
        double Lng;
        double Lat;
    }
  public class Work{
     double Lng;
     double Lat;
  }
public class MostVistidPlaces{
     double Lng ;
        double Lat ;
}
public class WeekendPlaces {
    double Lng;
        double Lat;
}
public class Tweet {
    String mostRetweetedTweet;
    int CountRetweeted;
    String MostFavoritedTweet;
    int countFavorited;
}
public class ProcessingText {
    double sportInterest;
    double polticalInteresr;
    double econmyInterest;
}
}
