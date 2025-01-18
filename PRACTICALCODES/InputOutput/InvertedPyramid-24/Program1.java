class Pattern1{
	public static void main(String[] args){

		int row=4;

		for(int i=row; i>=0; i--){

			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");

			}

			for(int j=1; j<=i*2-1; j++){
				
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
