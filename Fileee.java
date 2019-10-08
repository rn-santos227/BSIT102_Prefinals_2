import java.io.IOException;
import java.util.Scanner;
import java.io.*;


	 class file {
	
		
 		 public static void main(String[] args) throws IOException {
    	
   			 System.out.println("File Name:  ");
    		 Scanner scn = new Scanner(System.in);
    
    	File ffile = new File(scn.nextLine() + ".queen");
    	scn = new Scanner(ffile);
    	
    	String snn = scn.nextLine();
    	System.out.println(snn);
    	
    	scn.close();
}
}
