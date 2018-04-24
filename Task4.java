import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class Task4 {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream input = new FileInputStream("scores.txt");
		Scanner fscanner = new Scanner(input);
		FileOutputStream output1 = new FileOutputStream("good.txt");
		FileOutputStream output2 = new FileOutputStream("poor.txt");
		PrintWriter pwriter1 = new PrintWriter(output1);
		PrintWriter pwriter2 = new PrintWriter(output2);
		
		
		int num_stu=0;
		double score=0,sum=0,avg=0,id=0;
		
		while(fscanner.hasNextLine())
		{
			num_stu ++;
			id = fscanner.nextDouble();
			score = fscanner.nextDouble();	
			sum += score;
			
		}
		avg = sum/num_stu;
		fscanner.close();
		
		input = new FileInputStream("scores.txt");
		Scanner fscanner2 = new Scanner(input);
		while(fscanner2.hasNextLine())
		{
			id = fscanner2.nextDouble();
			score = fscanner2.nextDouble();
			pwriter1.printf("ID \t\t SCORE\n");
			pwriter2.printf("ID \t\t SCORE\n");
			if(score>=avg)
			{
				
				pwriter1.printf("%d \t\t %.2f",id,score);
			}
			if(score<avg)
			{
				
				pwriter2.printf("%d \t\t %.2f",id,score);
			}
		}
		fscanner.close();
		fscanner2.close();
        pwriter1.close();
		pwriter2.close();
		
	}

}
