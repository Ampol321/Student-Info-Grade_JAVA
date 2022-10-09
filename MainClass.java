package machine_problem_1;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		StudentClass stud = new StudentClass();
		GradesClass grd = new GradesClass();
		
		stud.name();
		stud.age();
		stud.section();
		grd.remarks();
		
		System.out.println("STUDENT INFORMATION");
		System.out.println("-------------------");
		System.out.println("Your name is: " + stud.name);
		System.out.println("You are : " + stud.age + " yrs old");
		System.out.println("You're from section: " + stud.section + "\n\n");
		
		System.out.println("GRADE REPORT");
		System.out.println("------------");
		System.out.println(String.format("Your grade is: %.2f", grd.Total));
		System.out.println("Your remark is: " + grd.remark);
	}

}
