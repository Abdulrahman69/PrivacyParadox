package privacy;


import java.text.DecimalFormat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saad
 */
public class Location {
    double longirude,latitude;
    int occure;

    public double getLongirude() {
        return longirude;
    }

    public double getLatitude() {
        return latitude;
    }

    public int getOccure() {
        return occure;
    }

    public void setLongirude(double longirude) {
        this.longirude = new Double(longirude);
    }

    public void setLatitude(double latitude) {
        this.latitude = new Double(latitude);
    }

    public void setOccure(int occure) {
        this.occure = occure;
    }

    public Location(double longirude, double latitude, int occure) {
        this.longirude = longirude;
        this.latitude = latitude;
        this.occure = occure;
    }
     public Location() {
        this.longirude = 0;
        this.latitude = 0;
        this.occure = 0;
    }
  public Location(Location L) {
        this.longirude = L.longirude;
        this.latitude = L.latitude;
        this.occure = L.occure;
    }
  

 
}