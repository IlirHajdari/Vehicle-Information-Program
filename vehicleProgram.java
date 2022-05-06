import java.util.Scanner;
public class Mod2{
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press the Enter Key to begin!");
		String begin = scanner.nextLine();
		
		System.out.println("Enter Vehicle Make: ");
		String brand = scanner.nextLine();
		
		System.out.println("Enter Vehicle Model: ");
		String model = scanner.nextLine();
		
		System.out.println("Enter Vehicle Year: ");
		int year = scanner.nextInt();
		
		System.out.println("Enter Starting Odometer Reading: ");
		int startOdo = scanner.nextInt();
		
		while(startOdo<0) {
			System.out.println("A negative odometer reading is not possible! Please enter the correct reading.");
			startOdo = scanner.nextInt();
		}
		System.out.println("Enter Ending Odometer Reading: ");
		int endOdo = scanner.nextInt();
		while (endOdo<startOdo) {
			System.out.println("Ending odometer should be greater than starting odometer");
			endOdo = scanner.nextInt();
		}
		System.out.println("Enter gallons used: ");
		int gallonsUsed = scanner.nextInt();
		while(gallonsUsed<0) {
			System.out.println("Gallons used cannot be a negative number: ");
			gallonsUsed = scanner.nextInt();
		}
		int mile = endOdo - startOdo;
		int mpg = 0;
		mpg = mile / gallonsUsed;
		System.out.println("Car Make: "+ brand);
		System.out.println("Car Model: "+ model);
		System.out.println("Car Year: "+ year);
		System.out.println("Car Starting Odometer Reading: "+ startOdo);
		System.out.println("Car Ending Odometer Reading: "+ endOdo);
		System.out.println("Car Gallons Used: "+ gallonsUsed);
		System.out.println("Car Estimated MPG: "+ mpg);
	}
}