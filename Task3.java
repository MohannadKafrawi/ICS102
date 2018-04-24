import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
public class Task3 {

	public static void main(String[] args) throws IOException{
		FileInputStream instream = new FileInputStream("arabic.txt");
	    Scanner fileScanner = new Scanner(instream, "UTF-8");
	    FileOutputStream outstream = new FileOutputStream("output2.txt");
        PrintWriter pwriter = new PrintWriter("output2.txt","UTF-8");
        
        String str1;
        while(fileScanner.hasNextLine())
        {
        	str1 = fileScanner.nextLine();
        	pwriter.println(str1);
        }
        fileScanner.close();
        instream.close();
        pwriter.close();
        outstream.close();


	}

}
