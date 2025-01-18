class Pattern13{
	public static void main(String[] args){

	int rows=4;
	int num=4;

		for(int i=4; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print(num + " ");
			}
			num--;
			System.out.println();
		}
	}
}

