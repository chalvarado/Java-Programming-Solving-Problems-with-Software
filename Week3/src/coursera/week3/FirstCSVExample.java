package coursera.week3;
/** Using CSV Libraries **/

import edu.duke.*;
import org.apache.commons.csv.*;

public class FirstCSVExample {
    public void readFood(){
        FileResource fr = new FileResource("foods.csv");
        CSVParser parser = fr.getCSVParser();
        for (CSVRecord record:parser){
            System.out.print(record.get("Name")+" ");
            System.out.print(record.get("Favorite Color")+" ");
            System.out.println(record.get("Favorite Food"));
        }
    }

    public static void main(String[] args) {
        FirstCSVExample pr = new FirstCSVExample();
        pr.readFood();
    }
}
