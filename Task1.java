import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class Task1 {

public static void main(String[] args) throws IOException {
    double sur_area,radius,height,volume;
    
    FileInputStream input = new FileInputStream("input.txt");
    Scanner kb = new Scanner(input);
    FileOutputStream output = new FileOutputStream("output.txt");
    PrintWriter pwriter = new PrintWriter(output);
    
    while(kb.hasNextLine()) {
    	
          sur_area = kb.nextDouble();
          
          radius = kb.nextDouble();
          
          height = sur_area/(2.0*Math.PI*radius)-(radius);
          
          volume = Math.PI*Math.pow(radius, 2)*height;
          
          pwriter.printf("Volume = %.2f cubic cm%n",volume);

}
         input.close();
         kb.close();
         pwriter.close();
         output.close();

}

}

