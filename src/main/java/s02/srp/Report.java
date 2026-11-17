package s02.srp;

/** Section 2: the class from the single responsibility question. */
public class Report {
    private String data;

    public void fetchDataFromDatabase() {
        System.out.println("Fetching data...");
        this.data = "raw data";
    }

    public void parseXMLData() {
        System.out.println("Parsing data as XML...");
        // logic to parse this.data
    }

    public void printToConsole() {
        System.out.println("--- REPORT ---");
        System.out.println(this.data);
        System.out.println("--- END ---");
    }
}
