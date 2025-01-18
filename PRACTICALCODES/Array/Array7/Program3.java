import java.util.*;

class Question3{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int rows=sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int cols=sc.nextInt();

		int arr[][]=new int[rows][cols];

		System.out.println("Enter the elements of the array: "); 

	        for (int i = 0; i < rows; i++) {
        	    for (int j = 0; j < cols; j++) {
                	System.out.print("Enter element [" + (i + 1) + ", " + (j + 1) + "]: ");
                	arr[i][j] = sc.nextInt();
		
           		 }
       		 }
		
		for (int i = 0; i < rows; i++) {
	            int rowSum = 0;
        	    for (int j = 0; j < cols; j++) {
                	rowSum += arr[i][j];
            	}
		System.out.println("Sum of row " + (i + 1) + ":" + rowSum);
		}	
	}
}


