

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

public class TestIN {
	private static final  String url = "/home/sajit/courses/algos2/Coursera/test/";
	@Test
	public void readTestSysNetfile() throws FileNotFoundException{
//		Scanner sc = new Scanner(new File(url+"test1.txt"));
//		sc.useDelimiter(",");
//		sc.u
		In in = new In(new File(url+"test1.txt"));
		while(in.hasNextLine()){
			//System.out.println(in.readLine());
			String line = in.readLine();
			Scanner sc = new Scanner(line);
			sc.useDelimiter(",");
			int id = sc.nextInt();
			//int id = Integer.parseInt(in.readString());
			String sysNet = sc.next(); //.readString();
			String gloss = sc.next();
			System.out.println(id+ " | " + sysNet + " |  " + gloss );
			
		}
		
		in.close();
		
	}

}
