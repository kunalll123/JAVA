class Pattern2{
	public static void main(String[] args){

		int rows=4;

		for(int i=1; i<=rows; i++){

			for(int sp=1; sp<=rows-i; sp++){

				System.out.print(" "+"\t");
			}
			int num=4;
			for(int j=1; j<=i; j++){

				System.out.print(num-- +"\t");
			}
			System.out.println();
		}
	}
}

