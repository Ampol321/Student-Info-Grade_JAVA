package machine_problem_1;
import java.io.*;
import java.util.Scanner;

public class StudentClass {

	String name, section;
	int age;
	
	public String name() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter your Name: ");
			name = scanner.nextLine();
		}
		catch (Exception ex){
			System.out.println("Warning: " + ex);
		}
		
		return name;
	}
	
	public int age() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.print("Enter your Age: ");
				age = Integer.parseInt(br.readLine());
			}
			catch (NumberFormatException e){
				System.out.println("Warning: " + e);
			}
		}while(age <= 0 || age > 100);
		return age;
	}
	
	public String section() {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter your Section: ");
			section = scanner.nextLine();
			System.out.print("\n\n");
		}
		catch (Exception ex){
			System.out.println("Warning: " + ex);
		}
		return section;
	}
}
