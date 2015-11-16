import java.util.ArrayList;

public class SearchTests {


    public static void main(String[] args) {

        AirportData airportData = new AirportData();
        ArrayList<Airport> chicagoAirports = airportData.findAirportsByCity("Chicago");
        for (Airport airport: chicagoAirports){

            System.out.printf("%-4s %-27s %-4.7f / %-4.7f \n", airport.getIata(),
                    airport.getName(), airport.getLat(), airport.getLon());

        }
        System.out.println(chicagoAirports);

    }


}
