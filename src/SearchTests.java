import java.util.ArrayList;

public class SearchTests {


    public static void main(String[] args) {

        AirportData airportData = new AirportData();
        ArrayList<Airport> chicagoAirports = airportData.findAirportsByCity("Chicago");
        _printList(chicagoAirports);

        ArrayList<Airport> germanAirports = airportData.findAirportsByCountry("Germany");
        _printList(germanAirports);

        System.out.println(airportData.findAirportByName("O\'hare International"));

    }


    private static void _printList(ArrayList<Airport> airportList){
        for (Airport airport: airportList){

            System.out.printf("%-4s %-25s %-35s %-4.7f / %-4.7f %8d\n", airport.getIata(),
                    airport.getCity(), airport.getName(), airport.getLat(), airport.getLon(), airport.getAlt());

        }
        System.out.println(airportList);

    }

}
