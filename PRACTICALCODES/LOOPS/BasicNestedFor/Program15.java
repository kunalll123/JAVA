class Pattern15{
	public static void main(String[] args){
		int row=4;
		int num=1;
		for(int i=1; i<=4; i++){
			int temp=1;
			
			for(int j=1; j<=4; j++){
				System.out.print(temp++ +" ");
			}
			
			System.out.println();
			num=num-3;
			
		}
	}
}
