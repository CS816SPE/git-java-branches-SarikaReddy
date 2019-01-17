import java.util.Scanner;
public class Calculator{
	public static void main(String[]args){
		float a, b, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.print("1. ADD 2 numbers\n");
			System.out.print("2. MULTIPLY 2 numbers");
			System.out.print("3. Exit\n\n");
			System.out.print("Enter your choice: ");
			choics = scan.next().charAt(0);
			switch(choice){
				case '1' : System.out.print("Enter two number: ");
						   a = scan.nextFloat();
						   b = scan.nextFloat();
						   res = a + b;
						   System.out.print("Result = " + res);
						   break;
				case '2' : System.out.print("Enter two number: ");
						   a = scan.nextFloat();
						   b = scan.nextFloat();
						   res = a * b;
						   System.out.print("Result = " + res);
						   break;
				case '3' : System.exit(0);
							break;
				default : System.out.print("INVALID CHOICE!!!");
						  break;
			}
		}
	}
}