import java.util.*;

class Question4{
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

		int sumOfOddRows=0;
		for(int i=0; i< rows; i++){
			if(i % 2 == 0){
				for(int j=0; j<cols; j++){
					sumOfOddRows += arr[i][j];
				}
			}
		}

		if(sumOfOddRows > 0){
			System.out.println("Sum of odd rows: " + sumOfOddRows);
		}else{
			System.out.println("There are no odd rows");
		}
	
	}
}


