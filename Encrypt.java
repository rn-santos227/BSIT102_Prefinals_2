import java.util.Scanner;
import java.io.IOException;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import java.util.ArrayList;
import java.util.Base64;

public class Encrypt
{
    public static void main(String args[]) throws IOException
    {
    	ArrayList<String> word = new ArrayList<>();
    	String wordInput;
    	Scanner sc = new Scanner(System.in);
    	
    	Boolean isDone = false;
    	
    	while(!isDone)
    	{
    		
    		System.out.print("Enter word: ");
    		wordInput = sc.nextLine();

    		if(!wordInput.equals("end"))
    		{
    			byte[] encodedBytes = Base64.getEncoder().encode((wordInput + "\n").getBytes());
    			word.add(new String(encodedBytes));
    		}
    		else
    		{
    			isDone = true;
    		}
    	}
    	
    	FileWriter fw = new FileWriter("Encrypted.sjtg");
    	
		for(String line : word)
		{
			fw.write (line + "\n");

		}
    	
    	fw.close();
	} 
}