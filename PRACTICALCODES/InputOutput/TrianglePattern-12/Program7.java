class Pattern7{
	public static void main(String[] args){

		int rows=4;
		
		for(int i=1; i<=rows; i++){
			
			char ch='a';
			System.out.print(i + " ");
			
			for(int j=1; j<=i; j++){
				if(j > 1){
					System.out.print(ch +  " ");
					ch++;
					}
			}

			if(i > 1){
				System.out.print(i);
				
			}
			

			for(int k=1; k<i; k++){
				System.out.print(" " + ch);
				
			}
			System.out.println();
		}
	}
}
