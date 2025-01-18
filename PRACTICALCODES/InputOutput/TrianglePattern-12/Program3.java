class Pattern3{
	public static void main(String[] args){

		int rows=4;

		for(int i=1; i<=rows; i++){
			char ch='D';
			for(int j=1; j<=i; j++){
				System.out.print(ch-- + " ");
			}
			System.out.println();
		}
		
	}
}
