class Pattern12{
	public static void main(String[] args){

		int rows=3;
		int num=3;

		for(int i=3; i>0; i--){
			for(int j=1; j<=i; j++){
				System.out.print(num + " ");
			}
			num--;
			System.out.println();
		}
	}
}
