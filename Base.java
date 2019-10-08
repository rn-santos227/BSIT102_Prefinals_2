import java.util.*;
import java.io.*;

	public class Base {
    
   	 public static void main(String[] args)throws IOException {
    	// Input string
    	Scanner scn = new Scanner(System.in);
    	// create array list
    	ArrayList<String> words = new ArrayList<String>();
    	
    		String wrds = "";
    		// TO DO add list
    		do {
    			 wrds = scn.nextLine();
 				 words.add(wrds);
    		}
    		while (!wrds.equals(":q")); {
    			// to convert in base64
    			for(String s: words) {
    				String convert = Base64.getEncoder() .encodeToString (s.getBytes());
    				System.out.println(convert);
    		//to ask if save or not
    			System.out.println ("save or discard? ");
    			String save = scn.nextLine();
    			//if the anser is yes then it will save to its filename	
    			if (save.equals("save"))
    			{
    				System.out.println ("Enter your File name ");
    				FileWriter flw = new FileWriter(convert+ ".queen");
    				flw.write(scn.nextLine());
    			
    				System.out.println ("SUCCESS! ");
    				break;
    			}
    		
    		
    		
    		
    		
    			}
   
    		}
    		
    		
    		
    		
    		
    	
    		
    	
    	
    }
}
