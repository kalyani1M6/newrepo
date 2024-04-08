import java.util.Scanner;
class Grade{

	public static void main(String[] args){

Scanner src= new Scanner(System.in);
	System.out.println("Enter your marks: ");
	 int marks= src.nextInt();

	 if(marks >= 0 && marks <= 30)
	 {
	 	System.out.println("Student fail");
	 }
	 else if(marks >= 31 && marks <= 59)
	 {
	 	System.out.println("second division");
	 }
	 else if(marks >= 61 && marks <= 100)
	 {
	 	System.out.println("first division");
	 }
	 else{
	 	System.out.println("invalid input");
	 }



	
	}
}