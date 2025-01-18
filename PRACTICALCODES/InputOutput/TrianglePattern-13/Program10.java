class Pattern10{
	public static void main(String[] args){
		
		int row=4;
		
		for(int i=1; i<=row; i++){
			int num=row-i+1;
			for(int j=1; j<=row-i+1; j++){
				
				if(i%2 == 0){
					System.out.print((char)(num+96) + "  ");
				
				}else{
					System.out.print((char)(num+64) + " ");
				}
				num--;
			}
			System.out.println();
		}
	}
}

