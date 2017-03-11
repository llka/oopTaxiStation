package ru.ilka.taxi.station.reader;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Здесь могла бы быть ваша реклама +375(29)3880490
 */
public class VehicleReader {
    static Logger logger = Logger.getLogger(VehicleReader.class);

    public List<List<String>> readVehicles(String filePath){
        ArrayList<List<String>> input = new ArrayList<>();
        FileReader fr = null;
        BufferedReader br = null;
        File file = new File(filePath);

        if(!file.exists()){
            logger.fatal("Can't find the file ( " + filePath + " )");
            throw new RuntimeException("No input data");
        }

        try {
            String line;
            List<String> dataList;
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                dataList =  Collections.unmodifiableList(Arrays.asList(line.split(";")));
                input.add(dataList);
            }
        }catch (FileNotFoundException e){
            logger.fatal("FileNotFoundException but this catch is unreachable");
        }catch (IOException e) {
            logger.error("IOException in dataReader but this catch is unreachable");
        }finally {
            try {
                br.close();
            }catch (IOException ex) {
                logger.error("IOException in dataReader closing" + ex);
            }
            try{
                fr.close();
            }catch(IOException ex) {
                logger.error("IOException in dataReader closing" + ex);
            }
        }
        return Collections.unmodifiableList(input);
    }

}
