import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
public class Task2 {

public static void main(String[] args) throws IOException{
	
	FileInputStream input = new FileInputStream("input2.txt");
	FileOutputStream output = new FileOutputStream("output2.txt");
	PrintWriter pwriter = new PrintWriter(output);
	Scanner fscanner = new Scanner(input);
	
	fscanner.useDelimiter("");
	
	int n_up=0, n_low=0, n_dig=0, n_white=0, n_other=0, sum=0;
	char ch;
	while(fscanner.hasNext())
	{
		ch = fscanner.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			n_up ++;
			sum++;
		}    
		else if(Character.isLowerCase(ch))
		{ 
			n_low++;
			sum ++;
		} 
		else if(Character.isDigit(ch))
		{ 
			n_dig++;
			sum++;
		}
		else if(Character.isWhitespace(ch))
		{
			n_white++;
			sum++;
		}
		else
		{
			n_other++;
			sum++;
		}
	}
       pwriter.printf("Number of uppercase characters = %d\r\n",n_up);
       pwriter.printf("Number of lowercase characters = %d\r\n",n_low);
       pwriter.printf("Number of digit characters = %d\r\n",n_dig);
       pwriter.printf("Number of whitespace characters = %d\r\n",n_white);
       pwriter.printf("Number of other characters = %d\r\n",n_other);
       pwriter.printf("Total number of characters = %d\r\n",sum);
       
       fscanner.close();
       pwriter.close();
       output.close();

}

}

