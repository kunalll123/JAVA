class Pattern8{
	public static void main(String[] args){

		int rows=3;

		for(int i=0; i<rows; i++){
			int num=3;

			for(int j=0; j<=i; j++){

				System.out.print(num + " ");
				num+=3;
			}
			System.out.println();
		}
	}
}
