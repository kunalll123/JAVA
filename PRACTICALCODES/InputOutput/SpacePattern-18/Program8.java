class Pattern8{
	public static void main(String[] args){

		int row=4;
		
		for(int i=1; i<=row; i++){

			for(int sp=1; sp<i; sp++){

				System.out.print(" "+"\t");
			}
			int num=i;	
			for(int j=row; j>=i; j--){

				System.out.print(num++ +"\t");
			}
			
			System.out.println();
		
		}
	}
}

