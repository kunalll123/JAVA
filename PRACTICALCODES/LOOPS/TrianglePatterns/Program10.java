class Pattern10{
	public static void main(String[] args){

		int n=4;

		for(int i=1; i<=n; i++){
			int num=i;
			for(int j=1; j<=i; j++){
				System.out.print(num + " ");
				num=num+i;
			}
			
			System.out.println();
		}
	}
}


