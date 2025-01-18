import java.util.*;

class StudentResult{
		public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Students Marks: ");
		String marks=sc.nextLine();
	
		if(marks>=90){
				System.out.println("First class with Distinction");
			}else if(marks>=75){
						System.out.println("first class");
					}else{
						System.out.println("second class");
					
		
		switch(marks){
	
			case 90:
					System.out.println("92 marks in Math");
					break;
			
			case "Science":
					System.out.println("85 marks in Science");
					break;
			
			case "English":
					System.out.println("75 marks in English");
					break;

			case "Biology":
					System.out.println("79 marks in Biology");
					break;

			case "Chemistry":
					System.out.println("87 marks in Chemistry");
					break;
	
			default :
					System.out.println("You failed the exam");
					break;
			}
		}
	}
}