package Example;
import java.util.*;
public class UserDefinedException {

	public static void main(String[] args) {
		
		Scanner Sc=new Scanner(System.in);
		int age;
		int amount;
		double balance=50000;

		try 
		{
			System.out.println("Enter a age: ");
			age = Sc.nextInt();
			if(age<0)
				throw new UnderAgeException("Age should be positive only ");
			else if (age>50)
				throw new AboveAgeException("Age should be below"
						+ " 50");
			else if(age>0 && age<18)
				throw new InvalidAgeException("Age should be between 18 to 50");
			else 
				System.out.println("Your age is valid! ");	
				try
				{
					System.out.println("Enter a amount: ");
					amount = Sc.nextInt();
					if(amount<balance)
					{
						balance -=amount;
						System.out.println("Withdraw successfully");
						throw new Exception("Current balance = " +balance);
					}
					
					else
					{
						System.out.println("Insufficient amount");
					}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
		
		catch(UnderAgeException e)
		{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
		
		catch(AboveAgeException e)
		{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
		
		catch(InvalidAgeException e)
		{
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
	}

}
