// Import the HashMap class
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;


import java.io.File;  // Import the File class
import java.io.FileWriter;  
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class UsernameGenerator {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<Integer, String> userNames = new HashMap<Integer, String>();
    HashMap<Integer, String> realNames = new HashMap<Integer, String>();

     try {
      File myObj = new File("MOCK_DATA.txt");
      Scanner myReader = new Scanner(myObj);

      Integer x = 0;
      while (myReader.hasNext()) {

        String userName = myReader.next();
        String realName = myReader.next();
        userNames.put(x, userName);
        realNames.put(x, realName);
   		x +=1;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }

    try {
	    FileWriter fw = new FileWriter("out2.txt");
	    for(int i = 0; i < 1000000; i++){

			   int randomUserName = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
         int randomRealName = ThreadLocalRandom.current().nextInt(1, 1000 + 1);
         int randomBig = ThreadLocalRandom.current().nextInt(1, 100000);
         int randomBig2 = ThreadLocalRandom.current().nextInt(1, 10000);




			   fw.write(userNames.get(randomUserName)+randomBig+randomBig2 +" ");			

	    	 fw.write(realNames.get(randomRealName) +"\n");

	    }

	    fw.close();
	  } catch(Exception e){
        System.out.println(e);
    }    
       

    System.out.println("Success...");    
  }  
}