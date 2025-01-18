class Pattern5{
	public static void main(String[] args){

		int rows=3;
		int x=1;
		for(int i=1; i<=rows; i++){
			int num=rows;
			char ch='C';
			for(int j=1; j<=rows; j++){
				System.out.print(x*x +"" + ch-- +"" + num-- +" ");
				x++;
			}
			System.out.println();
		}
	}
}

