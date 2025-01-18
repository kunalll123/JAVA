class Pattern8{
	public static void main(String[] args){

		int rows=4;
		int num=1;

		for(int i=1; i<=rows; i++){
			for(int j=1; j<=4; j++){
				System.out.print(num + " ");
				num=num+1;
			}
			System.out.println();
		}
	}
}
