import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
public class Task5 {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream instream = new FileInputStream("input.txt");
		   Scanner fscanner = new Scanner(instream);
		   Scanner kb = new Scanner(System.in);
		   
		   String str1 = "";
		   int freq=0;
		   fscanner.useDelimiter("[ \n\t\r?:.,;!]+");
		   
		   
		   
		   System.out.printf("Enter a word: ");
		   String word = kb.next();
		   
		   while(fscanner.hasNext())
		   {
			   str1 = fscanner.next();
			   if(word.equals(str1))
			   freq++;
			   
		   }
		   
		   System.out.print(freq);
		   
		   instream.close();
		   fscanner.close();
		   kb.close();

	}

}
