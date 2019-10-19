import java.util.Scanner;        // used for Scanner
import java.util.Base64;         //Base64 Binary Group
import java.io.*;                // All Input/Output Stream


public class Bajarodecrypt {

    public static void main(String[] args) throws Exception {
    	
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Filename");    //Enter the File of the Encoded Base64 Binary text
	
	File Fileout=new File (sc.nextLine()+ ".JMB");      // Open the File of with the File extension of the Binary  
	sc = new Scanner (Fileout);                        // Make Access in Scanner to Read the File 
	
	byte[] decodes = Base64.getDecoder().decode(sc.next());     //Base64 Decoder output from the Scanner
	
	String decodedStr = new String(decodes);           // Converts the decoder output from the Base64 Decoder output into a String format
	System.out.println("\n"+decodedStr);                    // Prints the decodedStr 
		 	
      	
    }
    
    
}