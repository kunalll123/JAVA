class Pattern13{
	public static void main(String[] args){

		char ch='D';
		int num=1;

		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				System.out.print(ch + "" + num++ + " ");
			}
			System.out.println();
		}
	}
}
