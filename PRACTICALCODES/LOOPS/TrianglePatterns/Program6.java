class Pattern6{
	public static void main(String[] args){

		int rows=3;
		char ch='A';
		
		for(int i=0; i < rows; i++){
			
			for(int j = 0; j <= i; j++){
				System.out.print(ch + " ");
				ch++;
				}

			System.out.println();
		
		}
	}
}
