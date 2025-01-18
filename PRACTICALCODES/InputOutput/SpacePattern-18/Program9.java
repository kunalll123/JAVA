class Pattern9{
	public static void main(String[] args){

		int rows=4;

		for(int i=1; i<=rows; i++){

			for(int sp=1; sp<=i; sp++){

				System.out.print(" "+"\t");
			}
			int num=64+rows;
			
			for(int j=rows; j>=i; j--){

				System.out.print((char)num-- +"\t");
			}
			System.out.println();
		}
	}
}

