import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Base64;

public class HaniDecrypt {
    public static void main(String[] args) throws IOException{
    	
    	Scanner sc = new Scanner(new File("Destiny.dmt"));

    	byte[] decodedBytes = Base64.getDecoder().decode(sc.next());
		System.out.println(new String(decodedBytes));
    	
    }
}