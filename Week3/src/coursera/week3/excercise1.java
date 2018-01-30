package coursera.week3;
import edu.duke.*;
import org.apache.commons.csv.*;

public class excercise1 {

     public static void bigExporters(CSVParser parser, String amount) {
       for (CSVRecord record : parser) {

           String country = record.get("Country");
           String value = record.get("Value (dollars)");

           if (value.length() > amount.length()) {
               System.out.println(country + ":" + value);
           }
       }

    }

    public void numberOfExports(CSVParser parser,String item){
        int count = 0;
        for (CSVRecord record: parser){
           String export = record.get("Exports");
            if (export.contains(item)){
                count +=1;
            }
        }
        System.out.println("Number of exports for "+item+" "+count);
    }

    public static void countryInfo(CSVParser parser, String c) {
        for (CSVRecord record : parser) {
            String country = record.get("Country");
            if (country.equals(c)) {
                String exports = record.get("Exports");
                String value = record.get("Value (dollars)");
                System.out.println(country + ": " + exports + ", " + value);
            }
        }
    }

    public void listExportersTwoProducts(CSVParser parser,String exportItem1, String exportItem2){
        System.out.println("Countries that export "+exportItem1+" & "+exportItem2);
        System.out.println("-------------------------------");
        for (CSVRecord record:parser){
            String export = record.get("Exports");
            if (export.contains(exportItem1)&&export.contains(exportItem2)){
                System.out.println(record.get("Country"));
            }
        }
    }

    public void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        //numberOfExports(parser,"gold");
        //countryInfo(parser,"Nauru");
        //listExportersTwoProducts(parser,"gold","diamonds");
        bigExporters(parser,"$999,999,999,999");
    }

    public static void main(String[] args) {
        excercise1 pr = new excercise1();
        pr.tester();
    }
}
