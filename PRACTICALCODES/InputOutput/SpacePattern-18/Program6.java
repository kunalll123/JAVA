class Pattern6{
	public static void main(String[] args){

		int row=4;
		int num=row;

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<i; sp++){

				System.out.print(" "+"\t");
			}

			for(int j=row; j>=i; j--){

				System.out.print(num +"\t");
			}
			num--;
			System.out.println();
		}
	}
}
