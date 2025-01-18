class ThreadDemo extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("In run");
			try{
				Thread.sleep(2000);
			}catch(Exception e){

			}
		}
	}
	public static void main(String[] args)throws InterruptedException{

		ThreadDemo td=new ThreadDemo();
		td.start();

		for(int i=0; i<10; i++){
			System.out.println("In main");
			td.join();
		}
	}
}
