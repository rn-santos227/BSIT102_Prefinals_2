import java.util.Scanner;         //used for scanner                      
import java.util.Base64;      //used for Base64 Binary Group
import java.util.ArrayList; 
import java.io.*;
import java.io.IOException;            //used for IOException
public class Bajaroencrypt {

    
    public static void main(String[] args) throws IOException {
    	
        Scanner sc = new Scanner(System.in);
		ArrayList<String> word = new ArrayList<>();                                       //The ArrayList that will accept the Strings 
		Boolean Running = true;                                                          // Boolean that has a default value of true
		
		System.out.println("Enter a words");                                            //Input any words
		
		while (Running == true) {                                                        // using the while loop and sets the value boolean true
			
			String letter =  sc.next();                                                    //Display any input while the boolean value is true
				
			  if (!letter.equals(":q")) {                           					        // if the user a display/input/type :q 
				  byte[] encodes = Base64.getEncoder().encode((letter + "\n").getBytes());      // Base64 Encoder that encodes any words everytime user inputs
				  word.add(new String(encodes));                                                // Puting the Encoded words into an array that can be used for multiple inputs
				 
			  }
			  else {                                                                         
				  Running = false;                                                        // Boolean value sets to false after you display/input :q
				  System.out.println("Enter your Filename");                              // Enter the Filename  
				  String Filename = sc.next();                                            // The input for the filename
				  Writer files = new FileWriter(Filename +".JMB");                         // Saved by a file extension
					 
				  for(String a: word)                                                     // for loop for ArrayList 
			    	{
			    		files.write(a);                                                   // Saves ArrayList's File with an extension
			    	}
			    	
			      	files.close();                                                        //The file will close
			      	sc.close();                                                           //The scanner will close too
				  }
				
    }
}
}
