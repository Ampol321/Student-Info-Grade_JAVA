package machine_problem_1;
import java.io.*;

public class GradesClass {
	
	int quiz1,quiz2,quiz3,unit1,unit2,termtest,sumQuiz,sumUnit;
	float QuizAve,UnitAve,TermAve,Total;
	char remark;
	
	public int Quiz1()throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.println("QUIZZES");
				System.out.println("-------");
				System.out.print("Enter your score in Quiz1: ");
				quiz1 = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException a) {
				System.out.println("Warning: " + a);
			}
		}while(quiz1 < 0 || quiz1 > 100);
		return quiz1;
	}
	
	public int Quiz2()throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.print("Enter your score in Quiz2: ");
				quiz2 = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException b) {
				System.out.println("Warning: " + b);
			}
		}while(quiz2 < 0 || quiz2 > 100);
		return quiz2;
	}
	
	public int Quiz3()throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.print("Enter your score in Quiz3: ");
				quiz3 = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException c) {
				System.out.println("Warning: " + c);
			}
		}while(quiz3 < 0 || quiz3 > 100);
		System.out.print("\n\n");
		return quiz3;
	}
	
	public int UnitTest1()throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.println("UNIT TESTS");
				System.out.println("----------");
				System.out.print("Enter your score in Unit Test1: ");
				unit1 = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException d) {
				System.out.println("Warning: " + d);
			}
		}while(unit1 < 0 || unit1 > 100);
		return unit1;
	}
	
	public int UnitTest2()throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.print("Enter your score in Unit Test2: ");
				unit2 = Integer.parseInt(br.readLine());
			}
			catch(NumberFormatException e) {
				System.out.println("Warning: " + e);
			}
		}while(unit2 < 0 || unit2 > 100);
		System.out.print("\n\n");
		return unit2;
	}
	
	public int TermTest()throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try{
				System.out.println("TERM TESTS");
				System.out.println("----------");
				System.out.print("Enter your Term Test score: ");
				termtest = Integer.parseInt(br.readLine());
				System.out.print("\n\n");
			}
			catch(NumberFormatException f) {
				System.out.println("Warning: " + f);
			}
		}while(termtest < 0 || termtest > 100);
		System.out.print("\n\n");
		return termtest;
	}
	
	public float QuizAverage() throws NumberFormatException, IOException  {
		Quiz1();
		Quiz2();
		Quiz3();
		
		sumQuiz = (quiz1 + quiz2 + quiz3) / 3;
		QuizAve = (float) (sumQuiz * 0.2);
		
		return QuizAve;
	}
	
	public float UnitAverage() throws NumberFormatException, IOException  {
		UnitTest1();
		UnitTest2();
		
		sumUnit = (unit1 + unit2) / 2;
		UnitAve = (float) (sumUnit * 0.4);
		
		return UnitAve;
	}
	
	public float TermAverage() throws NumberFormatException, IOException  {
		TermTest();

		TermAve = (float) (termtest * 0.4);
		
		return TermAve;
	}
	
	public float TotalGrade() throws NumberFormatException, IOException {
		QuizAverage();
		UnitAverage();
		TermAverage();
		
		Total = QuizAve + UnitAve + TermAve;
		
		return Total;
	}
	
	public char remarks() throws NumberFormatException, IOException {
		TotalGrade();
		
		if (Total >= 90 && Total <= 100) {
			remark = 'A';
		}
		else if (Total >= 80 && Total <= 89){
			remark = 'B';
		}
		else if (Total >= 70 && Total <= 79){
			remark = 'C';
		}
		else if (Total >= 60 && Total <= 69){
			remark = 'D';
		}
		else if (Total >= 80 && Total <= 89){
			remark = 'F';
		}
		return remark;
	}
}
