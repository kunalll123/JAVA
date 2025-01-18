class Pattern1{
	public static void main(String[] args){

		int row=4;

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");
			}


			for(int j=1; j<=i*2-1; j++){

				System.out.print("1"+"\t");
			}

			System.out.println();
		}
	}
}
