class Pattern12{
	public static void main(String[] args){

		int num=1;
		char ch='C';

		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				System.out.print(ch + "" + num++ + " ");
			}
			System.out.println();
		}
	}
}
