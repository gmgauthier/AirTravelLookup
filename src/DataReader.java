import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataReader {

    static List<String[]> readCSVFile(String fname){
        CSVReader reader = null;
        List<String[]> entries = null;
        try {
            reader = new CSVReader(new FileReader(fname));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (reader != null) entries = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return entries;
    }

}
