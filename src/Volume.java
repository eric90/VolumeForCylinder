import java.util.Scanner;

public class Volume {
	//private static Scanner input;

	public static void main (String[] arhs){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of cilender: ");
		double radius = input.nextDouble();
		System.out.print("Enter the length of cilender: ");
		double length = input.nextDouble();

		double area = radius * radius * 3.14159;
		double volume = area * length;
		System.out.println("The Volume is " + volume + "\n are is" + area);
		
		input.close();
	}
}
