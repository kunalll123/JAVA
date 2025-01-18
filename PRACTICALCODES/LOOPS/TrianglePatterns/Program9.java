class Pattern9{
	public static void main(String[] args){

		int rows=4;

		for(int i=0; i<rows; i++){
			int num=4;
			for(int j=0; j<=i; j++){
				System.out.print(num + " ");
				num=num+4;
			}
			System.out.println();
		}
	}
}



