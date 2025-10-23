package Example;
import java.util.*;
public class UncheckedException {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		
		int a,b;
		int age;
		int roll[] = {1,2,3};
		
		try
		{
			System.out.println("Enter a two numbers: ");
			a = Sc.nextInt();
			b = Sc.nextInt();
			System.out.println("Division: " +(a/b));
			System.out.println("first index number: " +roll[0]);
			//System.out.println("Fifth index number: " +roll[4]);
			System.out.println("Enter a age: ");
			age = Sc.nextInt();	
		}

		catch (ArithmeticException e)
		{
			System.out.println("Cannot be divide by 0 ");
			System.out.println(e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Wrong index");
			System.out.println(e.getMessage());
		}
		
		catch (Exception e)
		{
			System.out.println("Write only in numbers");
			System.out.println(e.getMessage());
		}
	}

}
