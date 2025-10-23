package Example;

import java.io.*;

public class CheckedException {

	public static void main(String[] args)  {
		
		//input output exceptions (file not found)	
		/*
		FileReader F1=new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\ExecptionHandling\\src\\Example\\Data.txt");
		BufferedReader B1=new BufferedReader(F1); //as usual user reader like scanner (file reader)
		System.out.println(B1.readLine());
		*/
		
		try {
			FileReader F1=new FileReader("C:\\Users\\Administrator\\eclipse-workspace\\ExecptionHandling\\src\\Example\\Data.txt");
			BufferedReader B1=new BufferedReader(F1); //as usual user reader like scanner (file reader)
			System.out.println(B1.readLine());
			}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
