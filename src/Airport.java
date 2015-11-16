
public class Airport implements Comparable<Airport> {
    private int ofid;
    private String name;
    private String city;
    private String country;
    private String iata;
    private String icao;
    private double lat;
    private double lon;
    private int alt;
    private float tzoffset; //half zones are expressed as decimals
    private char dst; // One of E (Europe), A (US/Canada), S (South America), O (Australia), Z (New Zealand), N (None) or U (Unknown)
    private String tzolsen;


    public Airport(int ofid, String name, String city, String country, String iata, String icao, double lat, double lon, int alt,
                   float tzoffset, char dst, String tzolsen) {
        this.ofid = ofid;
        this.name = name;
        this.city = city;
        this.country = country;
        this.iata = iata;
        this.icao = icao;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.tzoffset = tzoffset;
        this.dst = dst;
        this.tzolsen = tzolsen;
    }

    public int getOfid() {
        return ofid;
    }

    public void setOfid(int ofid) {
        this.ofid = ofid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public float getTzoffset() {
        return tzoffset;
    }

    public void setTzoffset(float tzoffset) {
        this.tzoffset = tzoffset;
    }

    public char getDst() {
        return dst;
    }

    public void setDst(char dst) {
        this.dst = dst;
    }

    public String getTzolsen() {
        return tzolsen;
    }

    public void setTzolsen(String tzolsen) {
        this.tzolsen = tzolsen;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "ofid=" + ofid +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", iata='" + iata + '\'' +
                ", icao='" + icao + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", alt=" + alt +
                ", tzoffset=" + tzoffset +
                ", dst=" + dst +
                ", tzolsen='" + tzolsen + '\'' +
                '}';
    }

    @Override
    public int compareTo(Airport o) {
        return (this.getCity().compareTo(o.getCity()));
    }
}
