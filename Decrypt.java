import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.util.Base64;

public class Decrypt {
    public static void main(String[] args) throws IOException{
    	
    	Scanner sc = new Scanner(new File("Encrypted.sjtg"));

    	
    	while(sc.hasNextLine()) {
            byte[] decodedBytes = Base64.getDecoder().decode(sc.nextLine());
			System.out.print(new String(decodedBytes));

        }
    }
}