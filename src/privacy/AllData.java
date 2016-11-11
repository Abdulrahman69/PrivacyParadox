package privacy;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad
 */
public class AllData {
    double longitude;
    double latitude;
    int hours;
    int day;
    int rt ;

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getHours() {
        return hours;
    }

    public int getDay() {
        return day;
    }

    public int getRt() {
        return rt;
    }

    public AllData(double longitude, double latitude, int hours, int day, int rt) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.hours = hours;
        this.day = day;
        this.rt = rt;
    }
    public AllData() {
        this.longitude = longitude;
        this.latitude = latitude;
        this.hours = hours;
        this.day = day;
        this.rt = rt;
    }

    public AllData(AllData ad) {
    this.day = ad.day;
    this.hours = ad.hours;
    this.latitude = ad.latitude;
    this.longitude = ad.longitude;
    this.rt = ad.rt ;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }
    
}
