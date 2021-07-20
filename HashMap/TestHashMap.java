import java.util.HashMap; // Import the HashMap class
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Timer; // Import the Timer class to time things
import java.util.concurrent.TimeUnit; // 



public class TestHashMap {
  public static void main(String[] args) {
    // Create a HashMap object called userNames
    HashMap<String, String> userNames = new HashMap<String, String>();

    long startTime = System.nanoTime();
     try {
      File myObj = new File("out.txt");
      Scanner myReader = new Scanner(myObj);

      while (myReader.hasNext()) {

        String userName = myReader.next();
        String realName = myReader.next();
        userNames.put(userName, realName);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }    

    long loadTime = System.nanoTime() - startTime;
    System.out.println("Read file into HashTable in: "  + loadTime +  " ns or " +  TimeUnit.NANOSECONDS.toMillis(loadTime) + " ms");
    
    long heapSize = Runtime.getRuntime().totalMemory(); 
    long heapFreeSize = Runtime.getRuntime().freeMemory(); 
    System.out.println("Total heap allocation: " + (heapSize / 1000000) + " MB");
    System.out.println("Total heap taken: " + ((heapSize - heapFreeSize)/ 1000000) + " MB");

    startTime = System.nanoTime();

    System.out.println(userNames.get("hnelseyff68425"));
    System.out.println(userNames.get("jpiffe4h60478"));
    System.out.println(userNames.get("cjurkiewiczkj14025"));
    System.out.println(userNames.get("ctrewhelaii26957"));
    System.out.println(userNames.get("kroelsd570320"));
    System.out.println(userNames.get("sballhamar63200"));
    System.out.println(userNames.get("bkittleylr11052"));
    System.out.println(userNames.get("nmayheadag92848"));

    

    long lookupTime = System.nanoTime() - startTime;
    System.out.println("Looked up various values in: " + lookupTime + " ns or " + TimeUnit.NANOSECONDS.toMillis(lookupTime) + " ms");


  }  
}