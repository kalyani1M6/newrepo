import java.util.Scanner;
class Evenodd{
	public static void main(String[] args)
	{

Scanner src =new Scanner(System.in);
System.out.println("Enter the number");
		int number = src.nextInt();


		if(number % 2== 0)
		{
			System.out.println(number +" is a Even number");
		}

	else
	{
		System.out.println(number + " number is odd");
	}
}
}