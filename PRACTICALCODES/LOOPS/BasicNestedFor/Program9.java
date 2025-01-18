class Pattern9{
	public static void main(String[] args){
		
		
		for(int i=1; i<=4; i++){
			int rows=4;
			int num=1;
			char ch='A';
			for(int j=1; j<=rows; j++){
				System.out.print(num++ + "" + ch++ + " ");
			}
			System.out.println();
		}
	}
}
