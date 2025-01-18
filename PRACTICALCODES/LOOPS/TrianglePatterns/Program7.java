class Pattern7{
	public static void main(String[] args){

	int rows=4;
	char ch='A';
		
	for(int i=0; i<rows; i++){

		for(int j=0; j<=i; j++){
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}

