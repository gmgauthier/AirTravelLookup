import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AirportData {
    private ArrayList<Airport> airports = new ArrayList<>();

    // Constructors
    public AirportData() {
        this("data/airports.dat");
    }

    public AirportData(String dataFile){
        List<String[]> csvData = DataReader.readCSVFile(dataFile);
        for (String[] row : csvData){
            Airport airport = createAirport(row);
            airports.add(airport);
        }
        // Collections.sort(airports);
    }

    //Accessors
    public ArrayList<Airport> getAirports() {
        return airports;
    }


    // Public methods
    public Airport findAirportByName(String name){
        return null;
    }

    public Airport findAirportByIATA(String iata){
        //TODO: Searching by IATA identifier
        return null;
    }

    public Airport findAirportByICAO(String icao){
        //TODO: Searching by ICAO identifier
        return null;
    }

    public ArrayList<Airport> findAirportsByCity(String city) {
        ArrayList<Airport> searchResults = airports.stream().filter(airport -> city.equals(airport.getCity())).
                collect(Collectors.toCollection(ArrayList::new));
        return searchResults;
    }

    public Airport findAirportsByCountry(String country){
        //TODO: Searching by country name
        return null;
    }

    public void sortAirports(){
        Collections.sort(this.airports);
    }

    // Private methods
    private Airport createAirport(String[] row){

        int ofid = Integer.parseInt(row[0]);
        String name = row[1];
        String city = row[2];
        String country = row[3];
        String iata = row[4];
        String icao = row[5];
        double lat = Double.parseDouble(row[6]);
        double lon = Double.parseDouble(row[7]);
        int alt = Integer.parseInt(row[8]);
        float tzoffset = Float.parseFloat(row[9]);
        char dst = row[10].charAt(0);
        String tzolsen = row[11];

        return new Airport(ofid, name, city, country, iata, icao, lat, lon, alt, tzoffset, dst, tzolsen);
    }



}
