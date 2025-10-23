package Example;
import java.util.*;
public class ExecptionsErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//syntax error or compile time error
			 
			//System.out.println("Systax Error")
		
			//logical error
			for(int i=1; i<11; i--)
			{
				System.out.println(i);
			}
		
			//run time error
			int a, b;
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			a = Sc.nextInt();
			System.out.println("Enter second number: ");
			b = Sc.nextInt();
			System.out.println("Divivsion: " +(a/b));

	}

}
